package com.neoris.tst.pruebatecnica.controller;

import com.neoris.tst.pruebatecnica.exception.GeneroException;
import com.neoris.tst.pruebatecnica.exception.PersonaException;
import com.neoris.tst.pruebatecnica.request.CrearCuentaRequest;
import com.neoris.tst.pruebatecnica.response.CrearCuentaResposne;
import com.neoris.tst.pruebatecnica.service.ClienteService;
import com.neoris.tst.pruebatecnica.service.CuentaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/neoristst/cuentas")
public class CuentaController {
    private final CuentaService cuentaService;

    public CuentaController(CuentaService cuentaService, ClienteService clienteService) {
        this.cuentaService = cuentaService;
    }

    @PostMapping
    public ResponseEntity<CrearCuentaResposne> crearCuenta(
            @RequestBody @Valid CrearCuentaRequest crearCuentaRequest)
            throws GeneroException, PersonaException {
        return new ResponseEntity(cuentaService.crearCuenta(crearCuentaRequest), HttpStatus.CREATED);
    }
}
