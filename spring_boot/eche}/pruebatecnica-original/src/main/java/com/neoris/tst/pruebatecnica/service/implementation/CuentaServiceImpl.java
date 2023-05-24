package com.neoris.tst.pruebatecnica.service.implementation;

import com.neoris.tst.pruebatecnica.domain.Cliente;
import com.neoris.tst.pruebatecnica.domain.Genero;
import com.neoris.tst.pruebatecnica.domain.Persona;
import com.neoris.tst.pruebatecnica.exception.ClienteException;
import com.neoris.tst.pruebatecnica.exception.GeneroException;
import com.neoris.tst.pruebatecnica.exception.PersonaException;
import com.neoris.tst.pruebatecnica.mapper.BuscarCuentaMapper;
import com.neoris.tst.pruebatecnica.mapper.BuscarUsuarioMapper;
import com.neoris.tst.pruebatecnica.mapper.CrearUsuarioMapper;
import com.neoris.tst.pruebatecnica.mapper.ModificarUsuarioMapper;
import com.neoris.tst.pruebatecnica.repository.ClienteRepository;
import com.neoris.tst.pruebatecnica.repository.CuentaRepository;
import com.neoris.tst.pruebatecnica.repository.PersonaRepository;
import com.neoris.tst.pruebatecnica.request.CrearUsuarioRequest;
import com.neoris.tst.pruebatecnica.request.ModificarUsuarioRequest;
import com.neoris.tst.pruebatecnica.response.BuscarCuentaResponse;
import com.neoris.tst.pruebatecnica.response.BuscarUsuarioResponse;
import com.neoris.tst.pruebatecnica.response.CrearUsuarioResponse;
import com.neoris.tst.pruebatecnica.response.ModificarUsuarioResponse;
import com.neoris.tst.pruebatecnica.service.ClienteService;
import com.neoris.tst.pruebatecnica.service.CuentaService;
import com.neoris.tst.pruebatecnica.service.GeneroService;
import com.neoris.tst.pruebatecnica.service.PersonaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.neoris.tst.pruebatecnica.utility.MensajeExcepcionService.*;

@Service
public class CuentaServiceImpl implements CuentaService {

    private final CuentaRepository cuentaRepository;

    public CuentaServiceImpl(
            CuentaRepository cuentaRepository) {
        this.cuentaRepository = cuentaRepository;

    }


    @Override
    @Transactional(readOnly = true)
    public List<BuscarCuentaResponse> buscarTodosLosCuentas() {
        return BuscarCuentaMapper.domainToResponseList(cuentaRepository.findAll());
    }

}
