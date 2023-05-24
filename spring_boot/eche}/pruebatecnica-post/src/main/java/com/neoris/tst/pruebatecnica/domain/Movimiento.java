package com.neoris.tst.pruebatecnica.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "movimiento")
public class Movimiento {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movimiento_id", nullable = false, unique = true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cuenta_id", referencedColumnName = "cuenta_id")
    private Cuenta cuenta;

    @ManyToOne
    @JoinColumn(name = "tipo_movimiento_id", referencedColumnName = "tipo_movimiento_id")
    private TipoMovimiento tipoMovimiento;

    @Column(nullable = false)
    private Timestamp fecha;

    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal valor;

    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal saldo;

    @Column(nullable = false)
    private Boolean estado;
}
