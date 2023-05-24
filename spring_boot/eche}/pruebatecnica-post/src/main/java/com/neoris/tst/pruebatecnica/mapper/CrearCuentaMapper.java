package com.neoris.tst.pruebatecnica.mapper;

import com.neoris.tst.pruebatecnica.domain.Cliente;
import com.neoris.tst.pruebatecnica.domain.Cuenta;
import com.neoris.tst.pruebatecnica.domain.Persona;
import com.neoris.tst.pruebatecnica.request.CrearCuentaRequest;
import com.neoris.tst.pruebatecnica.request.CrearUsuarioRequest;
import com.neoris.tst.pruebatecnica.response.CrearUsuarioResponse;

public class CrearCuentaMapper {
    public static Cuenta requestToCuenta(CrearCuentaRequest crearCuentaRequest) {
        return Cuenta.builder()
                .numeroCuenta(crearCuentaRequest.getNumeroCuenta())
                .saldoInicial(crearCuentaRequest.getSaldoInicial())
                .saldoActual(crearCuentaRequest.getSaldoActual())
                .estado(crearCuentaRequest.getEstado())
                .build();
    }

    public static Cliente requestToCliente(CrearUsuarioRequest usuarioRequest) {
        return Cliente.builder()
                .contrasena(usuarioRequest.getContrasena())
                .estado(true)
                .build();
    }
}
