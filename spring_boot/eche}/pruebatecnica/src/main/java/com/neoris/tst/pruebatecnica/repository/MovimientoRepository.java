package com.neoris.tst.pruebatecnica.repository;

import com.neoris.tst.pruebatecnica.domain.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface MovimientoRepository extends JpaRepository<Movimiento, Integer> {

    List<Movimiento> findByCuentaIdInAndFechaBetweenOrderByFechaAsc(List<Integer> cuentasIds, Timestamp desde, Timestamp hasta);

    List<Movimiento> findByCuentaIdAndFechaBetweenOrderByFechaAsc(Integer cuentaId, Timestamp desde, Timestamp hasta);

}
