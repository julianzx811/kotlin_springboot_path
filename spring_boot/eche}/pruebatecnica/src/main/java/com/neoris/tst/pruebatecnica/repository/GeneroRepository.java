package com.neoris.tst.pruebatecnica.repository;

import com.neoris.tst.pruebatecnica.domain.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer> {
    Optional<Genero> findGeneroByAbreviaturaAndEstado(String abreviatura, Boolean estado);
}
