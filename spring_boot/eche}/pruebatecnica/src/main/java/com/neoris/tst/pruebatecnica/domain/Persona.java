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
@Table(name = "persona")
public class Persona {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "persona_id", nullable = false, unique = true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "genero_id", referencedColumnName = "genero_id")
    private Genero genero;

    @Column(nullable = false, length = 90)
    private String nombre;

    @Column(nullable = false)
    private Short edad;

    @Column(nullable = false, length = 10)
    private String identificacion;

    @Column(nullable = false, length = 90)
    private String direccion;

    @Column(nullable = false, length = 10)
    private String telefono;

    @Column(nullable = false)
    private Boolean estado;
}
