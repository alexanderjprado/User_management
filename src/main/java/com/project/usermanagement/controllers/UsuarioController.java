package com.project.usermanagement.controllers;

import com.project.usermanagement.dao.UsuarioDao;
import com.project.usermanagement.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Alexander");
        usuario.setApellido("Prado");
        usuario.setEmail("ajph@gmail.com");
        usuario.setTelefono("123456");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuarios(@RequestBody Usuario usuario) {
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        usuarioDao.delete(id);
    }


    @RequestMapping(value = "usuarios2")
    public List<Usuario> getUsuarios2() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(51L);
        usuario.setNombre("Alexander");
        usuario.setApellido("Prado");
        usuario.setEmail("ajph@gmail.com");
        usuario.setTelefono("123456");

        Usuario usuario2 = new Usuario();
        usuario2.setId(9L);
        usuario2.setNombre("Alexandra");
        usuario2.setApellido("Prado");
        usuario2.setEmail("sandra@gmail.com");
        usuario2.setTelefono("7891011");

        Usuario usuario3 = new Usuario();
        usuario3.setId(1103L);
        usuario3.setNombre("Glenis");
        usuario3.setApellido("Figueroa");
        usuario3.setEmail("gfigueroa1103@gmail.com");
        usuario3.setTelefono("412099");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }
}
