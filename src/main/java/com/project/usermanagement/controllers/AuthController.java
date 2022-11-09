package com.project.usermanagement.controllers;

import com.project.usermanagement.dao.UsuarioDao;
import com.project.usermanagement.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private UsuarioDao usuarioDao;

    @PostMapping(path = "api/login")
    public String login(@RequestBody Usuario usuario) {
        if (usuarioDao.verificarCredenciales(usuario)) {
            return ("OK");
        } else {
            return ("FAIL");
        }
    }
}
