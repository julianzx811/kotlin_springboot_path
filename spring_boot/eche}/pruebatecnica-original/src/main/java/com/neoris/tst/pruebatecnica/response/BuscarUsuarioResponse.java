package com.neoris.tst.pruebatecnica.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class BuscarUsuarioResponse {
    private String identificacion;

    private String nombres;

    private String direccion;

    private String telefono;

    private String contrasena;

    @JsonProperty("genero")
    private String generoDescripcion;

    private Boolean estado;
}
