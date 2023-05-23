package com.neoris.tst.pruebatecnica.service;

import com.neoris.tst.pruebatecnica.domain.Cliente;
import com.neoris.tst.pruebatecnica.exception.ClienteException;
import com.neoris.tst.pruebatecnica.exception.GeneroException;
import com.neoris.tst.pruebatecnica.exception.PersonaException;
import com.neoris.tst.pruebatecnica.request.CrearCuentaRequest;
import com.neoris.tst.pruebatecnica.request.CrearUsuarioRequest;
import com.neoris.tst.pruebatecnica.request.ModificarUsuarioRequest;
import com.neoris.tst.pruebatecnica.response.BuscarUsuarioResponse;
import com.neoris.tst.pruebatecnica.response.CrearUsuarioResponse;
import com.neoris.tst.pruebatecnica.response.ModificarUsuarioResponse;

import java.util.List;


public interface CuentaService {

    CrearUsuarioResponse crearCuenta(CrearCuentaRequest crearCuentaRequest)
            throws GeneroException, PersonaException;

}
