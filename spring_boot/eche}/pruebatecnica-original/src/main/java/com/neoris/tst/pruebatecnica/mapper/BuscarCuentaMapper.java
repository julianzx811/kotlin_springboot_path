package com.neoris.tst.pruebatecnica.mapper;

import com.neoris.tst.pruebatecnica.domain.Cliente;
import com.neoris.tst.pruebatecnica.domain.Cuenta;
import com.neoris.tst.pruebatecnica.response.BuscarCuentaResponse;
import com.neoris.tst.pruebatecnica.response.BuscarUsuarioResponse;

import java.util.List;

public class BuscarCuentaMapper {
    public static BuscarCuentaResponse domainToResponse(Cuenta cuenta) {
        return BuscarCuentaResponse.builder()
                .nombre_cliente(cuenta.getCliente().getPersona().getNombre())
                .TipoCuenta(cuenta.getTipoCuenta().getAbreviatura())
                .numeroCuenta(cuenta.getNumeroCuenta())
                .saldoInicial(cuenta.getSaldoInicial())
                .saldoActual(cuenta.getSaldoActual())
                .estado(cuenta.getEstado())
                .build();
    }

    public static List<BuscarCuentaResponse> domainToResponseList(List<Cuenta> cuentas){
        return cuentas.stream().map(BuscarCuentaMapper::domainToResponse).toList();
    }

}
