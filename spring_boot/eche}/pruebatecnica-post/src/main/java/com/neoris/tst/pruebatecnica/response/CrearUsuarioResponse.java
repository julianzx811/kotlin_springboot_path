package com.neoris.tst.pruebatecnica.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CrearUsuarioResponse {

    private String nombres;
    private String direccion;
    private String telefono;
    private String contrasena;
    private Boolean estado;

}
