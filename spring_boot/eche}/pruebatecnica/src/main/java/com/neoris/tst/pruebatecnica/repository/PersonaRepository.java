package com.neoris.tst.pruebatecnica.repository;

import com.neoris.tst.pruebatecnica.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
    boolean existsByIdentificacionAndEstado(String identificacion, Boolean estado);
    boolean existsByIdentificacion(String identificacion);
    Optional<Persona> findByNombreAndEstado(String nombre, Boolean estado);
    Optional<Persona> findByIdentificacion(String identificacion);
}
