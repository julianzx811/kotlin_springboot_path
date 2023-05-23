package com.neoris.tst.pruebatecnica.utility.validations;

public class CrearModificarUsuarioValidate {
    public final static String NOMBRE_REQUIRED = "El campo nombres es obligatorio";
    public final static String NOMBRE_NOT_EMPTY = "El campo nombres no puede estar vacío";
    public final static String IDENTIFICACION_NOT_NULL = "La identificación del usuario es obligatoria";
    public final static String IDENTIFICACION_NOT_EMPTY = "La identificación del usuario no puede estar vacía";
    public final static String EDAD_NOT_NULL = "La edad del usuario es obligatoria";
    public final static String EDAD_MIN = "La edad del usuario debe ser mayor o igual a {value}";
    public final static int EDAD_MIN_VALUE = 18;
    public final static String DIRECCION_NOT_NULL = "La dirección del usuario es obligatoria";
    public final static String DIRECCION_NOT_EMPTY = "La dirección del usuario no puede estar vacía";
    public final static String TELEFONO_NOT_NULL = "El teléfono del usuario es obligatorio";
    public final static String TELEFONO_NOT_EMPTY = "El teléfono del usuario no puede estar vacío";
    public final static String CONTRASENA_NOT_NULL = "La contraseña es obligatoria";
    public final static String CONTRASENA_NOT_EMPTY = "La contraseña no puede estar vacía";
    public final static String GENERO_NOT_NULL = "El género es requerido";
    public final static String GENERO_NOT_EMPTY = "El género no puede estar vacío";
    public final static String GENERO_PATTERN_REGEX = "[MF]";
    public final static String GENERO_PATTERN = "El género debe ser F o M";
}
