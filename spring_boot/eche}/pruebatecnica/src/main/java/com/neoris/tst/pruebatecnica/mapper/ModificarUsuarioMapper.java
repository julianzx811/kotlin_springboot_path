package com.neoris.tst.pruebatecnica.mapper;

import com.neoris.tst.pruebatecnica.domain.Genero;
import com.neoris.tst.pruebatecnica.domain.Persona;
import com.neoris.tst.pruebatecnica.request.CrearUsuarioRequest;
import com.neoris.tst.pruebatecnica.request.ModificarUsuarioRequest;
import com.neoris.tst.pruebatecnica.response.ModificarUsuarioResponse;

public class ModificarUsuarioMapper {
    public static Persona requestToPersona(ModificarUsuarioRequest usuarioRequest, Persona persona, Genero genero) {
        persona.setNombre(usuarioRequest.getNombres());
        persona.setEdad(usuarioRequest.getEdad());
        persona.setDireccion(usuarioRequest.getDireccion());
        persona.setTelefono(usuarioRequest.getTelefono());
        persona.setGenero(genero);
        return persona;
    }

    public static ModificarUsuarioResponse domainToResponse(Persona persona, String contrasena, String genero) {
        return ModificarUsuarioResponse.builder()
                .identificacion(persona.getIdentificacion())
                .nombres(persona.getNombre())
                .direccion(persona.getDireccion())
                .telefono(persona.getTelefono())
                .contrasena(contrasena)
                .generoDescripcion(genero)
                .estado(persona.getEstado())
                .build();
    }

}
