package com.neoris.tst.pruebatecnica.mapper;

import com.neoris.tst.pruebatecnica.domain.Cliente;
import com.neoris.tst.pruebatecnica.domain.Genero;
import com.neoris.tst.pruebatecnica.domain.Persona;
import com.neoris.tst.pruebatecnica.request.ModificarUsuarioRequest;
import com.neoris.tst.pruebatecnica.response.BuscarUsuarioResponse;
import com.neoris.tst.pruebatecnica.response.ModificarUsuarioResponse;

import java.util.List;

public class BuscarUsuarioMapper {
    public static BuscarUsuarioResponse domainToResponse(Cliente cliente) {
        return BuscarUsuarioResponse.builder()
                .identificacion(cliente.getPersona().getIdentificacion())
                .nombres(cliente.getPersona().getNombre())
                .direccion(cliente.getPersona().getDireccion())
                .telefono(cliente.getPersona().getTelefono())
                .contrasena(cliente.getContrasena())
                .generoDescripcion(cliente.getPersona().getGenero().getDescripcion())
                .estado(cliente.getEstado())
                .build();
    }

    public static List<BuscarUsuarioResponse> domainToResponseList(List<Cliente> clientes){
        return clientes.stream().map(BuscarUsuarioMapper::domainToResponse).toList();
    }

}
