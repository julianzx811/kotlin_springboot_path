package com.neoris.tst.pruebatecnica.controller;

import com.neoris.tst.pruebatecnica.exception.CuentaException;
import com.neoris.tst.pruebatecnica.exception.GeneroException;
import com.neoris.tst.pruebatecnica.exception.PersonaException;
import com.neoris.tst.pruebatecnica.request.CrearCuentaRequest;
import com.neoris.tst.pruebatecnica.request.CrearUsuarioRequest;
import com.neoris.tst.pruebatecnica.response.BuscarCuentaResponse;
import com.neoris.tst.pruebatecnica.response.BuscarUsuarioResponse;
import com.neoris.tst.pruebatecnica.response.CrearCuentaResponse;
import com.neoris.tst.pruebatecnica.response.CrearUsuarioResponse;
import com.neoris.tst.pruebatecnica.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.neoris.tst.pruebatecnica.service.CuentaService;
import java.util.List;

@RestController
@RequestMapping("/neoristst/cuenta")
public class CuentaController {
    private final CuentaService CuentaService;

    public CuentaController(CuentaService CuentaService) {
        this.CuentaService = CuentaService;
    }

    @PostMapping
    public ResponseEntity<CrearCuentaResponse> crearCuenta(
            @RequestBody @Valid CrearCuentaRequest crearCuentaRequest)
            throws CuentaException {
        return new ResponseEntity(CuentaService.crearCuenta(crearCuentaRequest), HttpStatus.CREATED);
    }
    @GetMapping("/buscarCuentas")
    public ResponseEntity<List<BuscarCuentaResponse>> buscarCuentas() {
        return ResponseEntity.ok(CuentaService.buscarTodosLosCuentas());
    }
}
