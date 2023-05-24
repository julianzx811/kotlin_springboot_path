package com.neoris.tst.pruebatecnica.controller;

import com.neoris.tst.pruebatecnica.response.BuscarCuentaResponse;
import com.neoris.tst.pruebatecnica.response.BuscarUsuarioResponse;
import com.neoris.tst.pruebatecnica.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.neoris.tst.pruebatecnica.service.CuentaService;
import java.util.List;

@RestController
@RequestMapping("/neoristst/cuenta")
public class CuentaController {
    private final CuentaService CuentaService;

    public CuentaController(CuentaService CuentaService) {
        this.CuentaService = CuentaService;
    }

    @GetMapping("/buscarCuentas")
    public ResponseEntity<List<BuscarCuentaResponse>> buscarCuentas() {
        return ResponseEntity.ok(CuentaService.buscarTodosLosCuentas());
    }
}
