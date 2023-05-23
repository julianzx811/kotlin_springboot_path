package com.neoris.tst.pruebatecnica.utility;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.ZoneId;

public class FechaUtil {
    public static Timestamp fecha(LocalDate fecha) {
        return Timestamp.valueOf(fecha.atStartOfDay(ZoneId.of("GMT-5")).toLocalDateTime());
    }
}
