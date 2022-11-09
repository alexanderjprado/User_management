package com.project.usermanagement.dao;

import com.project.usermanagement.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void delete(Long id);

    void registrar(Usuario usuario);
}
