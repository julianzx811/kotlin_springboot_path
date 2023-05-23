package com.neoris.tst.pruebatecnica.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "cuenta")
public class Cuenta {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cuenta_id", nullable = false, unique = true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "tipo_cuenta_id", referencedColumnName = "tipo_cuenta_id")
    private TipoCuenta tipoCuenta;

    @Column(name = "numero_cuenta", nullable = false, length = 30)
    private String numeroCuenta;

    @Column(name = "saldo_inicial", precision = 19, scale = 2, nullable = false)
    private BigDecimal saldoInicial;

    @Column(name = "saldo_actual", precision = 19, scale = 2, nullable = false)
    private BigDecimal saldoActual;

    @Column(nullable = false)
    private Boolean estado;

    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
    List<Movimiento> movimientos;
}
