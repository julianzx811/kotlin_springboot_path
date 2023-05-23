package com.neoris.tst.pruebatecnica.response;

import com.neoris.tst.pruebatecnica.domain.Cliente;
import com.neoris.tst.pruebatecnica.domain.Movimiento;
import com.neoris.tst.pruebatecnica.domain.TipoCuenta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class CrearCuentaResposne {

    private String cliente;

    private String tipoCuenta;

    private String numeroCuenta;

    private String saldoInicial;

    private String saldoActual;

    private boolean estado;
}
