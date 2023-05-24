package com.neoris.tst.pruebatecnica.request;

import com.neoris.tst.pruebatecnica.utility.validations.CrearModificarCuentaValidate;
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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CrearCuentaRequest {

    @NotNull(message = CrearModificarCuentaValidate.cliente_id_REQUIRED)
    @NotEmpty(message = CrearModificarCuentaValidate.cliente_id_NOT_EMPTY)
    private Integer cliente_id;

    @NotNull(message = CrearModificarCuentaValidate.tipoCuenta_id_NOT_NULL)
    @NotEmpty(message = CrearModificarCuentaValidate.tipoCuenta_id_NOT_EMPTY)
    private String tipoCuenta_id;

    @NotNull(message = CrearModificarCuentaValidate.numeroCuenta_NOT_NULL)
    //@Min(value = CrearModificarCuentaValidate.numeroCuenta_MIN_VALUE, message = CrearModificarCuentaValidate.numeroCuenta_MIN)
    //@NumberFormat(style = NumberFormat.Style.NUMBER)
    private String numeroCuenta;

    @NotNull(message = CrearModificarCuentaValidate.saldoInicial_NOT_NULL)
    @NotEmpty(message = CrearModificarCuentaValidate.saldoInicial_NOT_EMPTY)
    private BigDecimal saldoInicial;

    @NotNull(message = CrearModificarCuentaValidate.saldoActual_NOT_NULL)
    @NotEmpty(message = CrearModificarCuentaValidate.saldoActual_NOT_EMPTY)
    private BigDecimal saldoActual;

    @NotNull(message = CrearModificarCuentaValidate.estado_NOT_NULL)
    @NotEmpty(message = CrearModificarCuentaValidate.estado_NOT_EMPTY)
    private Boolean estado;
}