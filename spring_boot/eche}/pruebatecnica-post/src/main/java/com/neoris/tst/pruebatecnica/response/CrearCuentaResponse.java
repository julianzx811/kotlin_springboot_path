package com.neoris.tst.pruebatecnica.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
public class CrearCuentaResponse {

    private String nombre_cliente;
    private String tipoCuenta;
    private String numeroCuenta;
    private String saldoInicial;
    private BigDecimal saldoActual;
    private BigDecimal estado;
}
