package com.neoris.tst.pruebatecnica.service.implementation;

import com.neoris.tst.pruebatecnica.domain.Cliente;
import com.neoris.tst.pruebatecnica.domain.Genero;
import com.neoris.tst.pruebatecnica.domain.Persona;
import com.neoris.tst.pruebatecnica.exception.ClienteException;
import com.neoris.tst.pruebatecnica.exception.GeneroException;
import com.neoris.tst.pruebatecnica.exception.PersonaException;
import com.neoris.tst.pruebatecnica.mapper.BuscarUsuarioMapper;
import com.neoris.tst.pruebatecnica.mapper.CrearUsuarioMapper;
import com.neoris.tst.pruebatecnica.mapper.ModificarUsuarioMapper;
import com.neoris.tst.pruebatecnica.repository.ClienteRepository;
import com.neoris.tst.pruebatecnica.repository.PersonaRepository;
import com.neoris.tst.pruebatecnica.request.CrearUsuarioRequest;
import com.neoris.tst.pruebatecnica.request.ModificarUsuarioRequest;
import com.neoris.tst.pruebatecnica.response.BuscarUsuarioResponse;
import com.neoris.tst.pruebatecnica.response.CrearUsuarioResponse;
import com.neoris.tst.pruebatecnica.response.ModificarUsuarioResponse;
import com.neoris.tst.pruebatecnica.service.ClienteService;
import com.neoris.tst.pruebatecnica.service.GeneroService;
import com.neoris.tst.pruebatecnica.service.PersonaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.neoris.tst.pruebatecnica.utility.MensajeExcepcionService.*;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final PersonaService personaService;
    private final GeneroService generoService;
    private final PersonaRepository personaRepository;

    public ClienteServiceImpl(
            ClienteRepository clienteRepository,
            PersonaService personaService,
            GeneroService generoService,
            PersonaRepository personaRepository) {
        this.clienteRepository = clienteRepository;
        this.personaService = personaService;
        this.generoService = generoService;
        this.personaRepository = personaRepository;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CrearUsuarioResponse crearUsuario(CrearUsuarioRequest crearUsuarioRequest)
            throws GeneroException, PersonaException {

        Persona persona = CrearUsuarioMapper.requestToPersona(crearUsuarioRequest);
        Genero genero = generoService.buscarGeneroPorAbreviatura(crearUsuarioRequest.getGenero());
        Cliente cliente = CrearUsuarioMapper.requestToCliente(crearUsuarioRequest);

        persona.setGenero(genero);

        persona = personaService.guardarPersona(persona);
        cliente.setPersona(persona);

        cliente = clienteRepository.save(cliente);

        return CrearUsuarioMapper.domainToResponse(persona, cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente buscarClientePorNombreYEstado(String nombre, boolean estado)
            throws PersonaException, ClienteException {
        Persona persona = personaService.buscarPersonaPorNombreYEstado(nombre, estado);
        return clienteRepository
                .findByPersonaId(persona.getId()).orElseThrow(
                        () ->new ClienteException(
                                String.format(CLIENTE_NO_EXISTE_POR_NOMBRE_MENSAJE, persona.getIdentificacion())));
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ModificarUsuarioResponse modificarUsuario(ModificarUsuarioRequest modificarUsuarioRequest)
            throws GeneroException, PersonaException, ClienteException {
        Cliente cliente = buscarClientePorIdentificacion(modificarUsuarioRequest.getIdentificacion());
        Persona persona = cliente.getPersona();
        Genero genero = persona.getGenero();

        persona = personaRepository.save(ModificarUsuarioMapper.requestToPersona(modificarUsuarioRequest, persona, genero));
        cliente.setContrasena(modificarUsuarioRequest.getContrasena());
        cliente = clienteRepository.save(cliente);

        return ModificarUsuarioMapper.domainToResponse(persona, cliente.getContrasena(), genero.getDescripcion());
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente buscarClientePorPersonaId(Integer personaId) throws ClienteException {
        return clienteRepository.findByPersonaId(personaId).orElseThrow(
                        () ->new ClienteException(CLIENTE_NO_EXISTE_MENSAJE));
    }

    @Override
    @Transactional(readOnly = true)
    public List<BuscarUsuarioResponse> buscarTodosLosClientes() {
        return BuscarUsuarioMapper.domainToResponseList(clienteRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public List<BuscarUsuarioResponse> buscarTodosLosClientesPorEstado(boolean estado) {
        return BuscarUsuarioMapper.domainToResponseList(clienteRepository.findByEstado(estado));
    }

    @Override
    @Transactional(readOnly = true)
    public BuscarUsuarioResponse buscarUsuarioPorIdentificacion(String identificacion)
            throws PersonaException, ClienteException {
        return BuscarUsuarioMapper.domainToResponse(buscarClientePorIdentificacion(identificacion));
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente buscarClientePorIdentificacion(String identificacion) throws PersonaException, ClienteException {
        Persona persona = personaService.buscarPersonaPorIdentificacion(identificacion);
        return buscarClientePorPersonaId(persona.getId());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public String eliminarUsuario(String identificacion) throws PersonaException, ClienteException {
        Cliente cliente = buscarClientePorIdentificacion(identificacion);
        if(!cliente.getCuentas().isEmpty()) {
            throw new ClienteException(CLIENTE_TIENE_CUENTAS_MENSAJE);
        }

        Persona persona = cliente.getPersona();
        String mensajeExito = String.format(CLIENTE_ELIMINADO, persona.getNombre());

        clienteRepository.delete(cliente);
        personaRepository.delete(persona);

        return mensajeExito;
    }
}
