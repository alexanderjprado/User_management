package com.project.usermanagement.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UsuarioDto implements Serializable {

    private final Long id;
    private final String nombre;
    private final String apellido;
    private final String email;
    private final String telefono;
    private final String password;
}