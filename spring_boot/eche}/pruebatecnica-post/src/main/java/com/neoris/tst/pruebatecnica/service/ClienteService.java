package com.neoris.tst.pruebatecnica.service;

import com.neoris.tst.pruebatecnica.domain.Cliente;
import com.neoris.tst.pruebatecnica.exception.ClienteException;
import com.neoris.tst.pruebatecnica.exception.GeneroException;
import com.neoris.tst.pruebatecnica.exception.PersonaException;
import com.neoris.tst.pruebatecnica.request.CrearUsuarioRequest;
import com.neoris.tst.pruebatecnica.request.ModificarUsuarioRequest;
import com.neoris.tst.pruebatecnica.response.BuscarUsuarioResponse;
import com.neoris.tst.pruebatecnica.response.CrearUsuarioResponse;
import com.neoris.tst.pruebatecnica.response.ModificarUsuarioResponse;

import java.util.List;


public interface ClienteService {

    CrearUsuarioResponse crearUsuario(CrearUsuarioRequest crearUsuarioRequest)
            throws GeneroException, PersonaException;

    Cliente buscarClientePorNombreYEstado(String nombre, boolean estado)
            throws PersonaException, ClienteException;

    ModificarUsuarioResponse modificarUsuario(ModificarUsuarioRequest modificarUsuarioRequest)
            throws GeneroException, PersonaException, ClienteException;

    Cliente buscarClientePorPersonaId(Integer personaId) throws ClienteException;

    List<BuscarUsuarioResponse> buscarTodosLosClientes();

    List<BuscarUsuarioResponse> buscarTodosLosClientesPorEstado(boolean estado);

    BuscarUsuarioResponse buscarUsuarioPorIdentificacion(String identificacion) throws PersonaException, ClienteException;

    String eliminarUsuario(String identificacion) throws PersonaException, ClienteException;

    Cliente buscarClientePorIdentificacion(String identificacion) throws PersonaException, ClienteException;

}
