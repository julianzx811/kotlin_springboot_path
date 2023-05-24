package com.neoris.tst.pruebatecnica.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
public class BuscarCuentaResponse {
    private String nombre_cliente;

    private String TipoCuenta;

    private String numeroCuenta;

    private BigDecimal saldoInicial;

    private BigDecimal saldoActual;

    @JsonProperty("genero")
    private Boolean estado;

}
