package com.example.api_reserva_mesa.controllers;

import com.example.api_reserva_mesa.entity.UsersEntity;
import com.example.api_reserva_mesa.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UsuarioRepository usuarioRepository;

    public UserController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping
    public UsersEntity criarUsuario(@RequestBody UsersEntity user) {

        
        if (user.getEmail() == null || user.getEmail().isEmpty() || 
            user.getSenha() == null || user.getSenha().isEmpty() || 
            user.getNome() == null || user.getNome().isEmpty()) {

            throw new IllegalStateException("Todos os campos devem ser preenchidos");
        }

        if (usuarioRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalStateException("Email ja existe");
        }

        return usuarioRepository.save(user);
    }

    @GetMapping
    public List<UsersEntity> buscarTodos() {
        return usuarioRepository.findAll();
    }
}
