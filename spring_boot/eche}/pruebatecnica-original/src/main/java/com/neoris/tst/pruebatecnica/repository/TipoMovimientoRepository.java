package com.neoris.tst.pruebatecnica.repository;

import com.neoris.tst.pruebatecnica.domain.TipoCuenta;
import com.neoris.tst.pruebatecnica.domain.TipoMovimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoMovimientoRepository extends JpaRepository<TipoMovimiento, Integer> {

    Optional<TipoMovimiento> findByDescripcionAndEstado(String descripcion, Boolean estado);

}
