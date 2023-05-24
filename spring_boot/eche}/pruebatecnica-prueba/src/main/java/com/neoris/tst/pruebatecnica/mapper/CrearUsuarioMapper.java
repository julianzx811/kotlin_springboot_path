package com.neoris.tst.pruebatecnica.mapper;

import com.neoris.tst.pruebatecnica.domain.Cliente;
import com.neoris.tst.pruebatecnica.domain.Persona;
import com.neoris.tst.pruebatecnica.request.CrearUsuarioRequest;
import com.neoris.tst.pruebatecnica.response.CrearUsuarioResponse;

public class CrearUsuarioMapper {
    public static Persona requestToPersona(CrearUsuarioRequest usuarioRequest) {
        return Persona.builder()
                .nombre(usuarioRequest.getNombres())
                .edad(usuarioRequest.getEdad())
                .identificacion(usuarioRequest.getIdentificacion())
                .direccion(usuarioRequest.getDireccion())
                .telefono(usuarioRequest.getTelefono())
                .estado(true)
                .build();
    }

    public static Cliente requestToCliente(CrearUsuarioRequest usuarioRequest) {
        return Cliente.builder()
                .contrasena(usuarioRequest.getContrasena())
                .estado(true)
                .build();
    }

    public static CrearUsuarioResponse domainToResponse(Persona persona, Cliente cliente) {
        return CrearUsuarioResponse.builder()
                .nombres(persona.getNombre())
                .direccion(persona.getDireccion())
                .telefono(persona.getTelefono())
                .contrasena(cliente.getContrasena())
                .estado(persona.getEstado())
                .build();
    }

}
