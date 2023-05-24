package com.neoris.tst.pruebatecnica.service.implementation;

import com.neoris.tst.pruebatecnica.domain.Cuenta;
import com.neoris.tst.pruebatecnica.exception.CuentaException;
import com.neoris.tst.pruebatecnica.mapper.*;
import com.neoris.tst.pruebatecnica.repository.CuentaRepository;
import com.neoris.tst.pruebatecnica.request.CrearCuentaRequest;
import com.neoris.tst.pruebatecnica.response.*;
import com.neoris.tst.pruebatecnica.service.ClienteService;
import com.neoris.tst.pruebatecnica.service.CuentaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CuentaServiceImpl implements CuentaService {

    private final CuentaRepository cuentaRepository;
    private final ClienteService clienteService;
    public CuentaServiceImpl(
            CuentaRepository cuentaRepository, ClienteService clienteService) {
        this.cuentaRepository = cuentaRepository;

        this.clienteService = clienteService;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CrearCuentaResponse crearCuenta(CrearCuentaRequest crearCuentaRequest)
            throws CuentaException {
        Cuenta cuenta = CrearCuentaMapper.requestToCuenta(crearCuentaRequest);
        cuenta.setCliente();
        cuenta.setTipoCuenta();
        //Persona persona = CrearUsuarioMapper.requestToPersona(crearUsuarioRequest);
        //Genero genero = generoService.buscarGeneroPorAbreviatura(crearUsuarioRequest.getGenero());
        //Cliente cliente = CrearUsuarioMapper.requestToCliente(crearUsuarioRequest);

        //persona.setGenero(genero);

        //persona = personaService.guardarPersona(persona);
        //cliente.setPersona(persona);

        //cliente = clienteRepository.save(cliente);

        //return CrearUsuarioMapper.domainToResponse(persona, cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public List<BuscarCuentaResponse> buscarTodosLosCuentas() {
        return BuscarCuentaMapper.domainToResponseList(cuentaRepository.findAll());
    }

}
