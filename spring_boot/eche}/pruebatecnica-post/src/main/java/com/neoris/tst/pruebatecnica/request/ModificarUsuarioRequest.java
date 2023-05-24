package com.neoris.tst.pruebatecnica.request;

import com.neoris.tst.pruebatecnica.utility.validations.CrearModificarUsuarioValidate;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ModificarUsuarioRequest {

    @NotNull(message = CrearModificarUsuarioValidate.IDENTIFICACION_NOT_NULL)
    @NotEmpty(message = CrearModificarUsuarioValidate.IDENTIFICACION_NOT_EMPTY)
    private String identificacion;

    @NotNull(message = CrearModificarUsuarioValidate.NOMBRE_REQUIRED)
    @NotEmpty(message = CrearModificarUsuarioValidate.NOMBRE_NOT_EMPTY)
    private String nombres;

    @NotNull(message = CrearModificarUsuarioValidate.EDAD_NOT_NULL)
    @Min(value = CrearModificarUsuarioValidate.EDAD_MIN_VALUE, message = CrearModificarUsuarioValidate.EDAD_MIN)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short edad;

    @NotNull(message = CrearModificarUsuarioValidate.DIRECCION_NOT_NULL)
    @NotEmpty(message = CrearModificarUsuarioValidate.DIRECCION_NOT_EMPTY)
    private String direccion;

    @NotNull(message = CrearModificarUsuarioValidate.TELEFONO_NOT_NULL)
    @NotEmpty(message = CrearModificarUsuarioValidate.TELEFONO_NOT_EMPTY)
    private String telefono;

    @NotNull(message = CrearModificarUsuarioValidate.CONTRASENA_NOT_NULL)
    @NotEmpty(message = CrearModificarUsuarioValidate.CONTRASENA_NOT_EMPTY)
    private String contrasena;

    @NotNull(message = CrearModificarUsuarioValidate.GENERO_NOT_NULL)
    @NotEmpty(message = CrearModificarUsuarioValidate.GENERO_NOT_EMPTY)
    @Pattern(regexp = CrearModificarUsuarioValidate.GENERO_PATTERN_REGEX, message = CrearModificarUsuarioValidate.GENERO_PATTERN)
    private String genero;

}