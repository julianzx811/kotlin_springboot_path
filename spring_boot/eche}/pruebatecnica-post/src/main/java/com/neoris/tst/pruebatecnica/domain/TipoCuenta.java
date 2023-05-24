package com.neoris.tst.pruebatecnica.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tipo_cuenta")
public class TipoCuenta {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_cuenta_id", nullable = false, unique = true)
    private Integer id;

    @Column(nullable = false, length = 2)
    private String abreviatura;

    @Column(nullable = false, length = 30)
    private String descripcion;

    @Column(nullable = false)
    private Boolean estado;
}
