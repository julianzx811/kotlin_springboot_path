package com.neoris.tst.pruebatecnica.request;

import com.neoris.tst.pruebatecnica.domain.Cliente;
import com.neoris.tst.pruebatecnica.domain.Movimiento;
import com.neoris.tst.pruebatecnica.domain.TipoCuenta;
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

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CrearCuentaRequest {

    //@NotNull(message = CrearModificarUsuarioValidate.NOMBRE_REQUIRED)
    //@NotEmpty(message = CrearModificarUsuarioValidate.NOMBRE_NOT_EMPTY)
    private Cliente cliente;

    @NotNull(message = CrearModificarUsuarioValidate.IDENTIFICACION_NOT_NULL)
    @NotEmpty(message = CrearModificarUsuarioValidate.IDENTIFICACION_NOT_EMPTY)
    private TipoCuenta tipoCuenta;

    @NotNull(message = CrearModificarUsuarioValidate.EDAD_NOT_NULL)
    @Min(value = CrearModificarUsuarioValidate.EDAD_MIN_VALUE, message = CrearModificarUsuarioValidate.EDAD_MIN)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private String numeroCuenta;

    @NotNull(message = CrearModificarUsuarioValidate.DIRECCION_NOT_NULL)
    @NotEmpty(message = CrearModificarUsuarioValidate.DIRECCION_NOT_EMPTY)
    private BigDecimal saldoInicial;

    @NotNull(message = CrearModificarUsuarioValidate.DIRECCION_NOT_NULL)
    @NotEmpty(message = CrearModificarUsuarioValidate.DIRECCION_NOT_EMPTY)
    private BigDecimal saldoActual;

    @NotNull(message = CrearModificarUsuarioValidate.TELEFONO_NOT_NULL)
    @NotEmpty(message = CrearModificarUsuarioValidate.TELEFONO_NOT_EMPTY)
    private Boolean estado;

    @NotNull(message = CrearModificarUsuarioValidate.CONTRASENA_NOT_NULL)
    @NotEmpty(message = CrearModificarUsuarioValidate.CONTRASENA_NOT_EMPTY)
    private List<Movimiento> movimientos;


}
