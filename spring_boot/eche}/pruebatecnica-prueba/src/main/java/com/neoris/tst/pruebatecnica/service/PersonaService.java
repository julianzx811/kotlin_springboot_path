package com.neoris.tst.pruebatecnica.service;

import com.neoris.tst.pruebatecnica.domain.Persona;
import com.neoris.tst.pruebatecnica.exception.PersonaException;

public interface PersonaService {
    Persona guardarPersona(Persona persona) throws PersonaException;
    Persona buscarPersonaPorNombreYEstado(String nombre, Boolean estado) throws PersonaException;
    Persona buscarPersonaPorIdentificacion(String identificacion) throws PersonaException;
    Persona inactivarPersona(Persona persona);
    Persona activarPersona(Persona persona);

}
