package com.example.api_reserva_mesa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;    
    private String email;
    private String senha;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id;}

    public String getNome() { return nome; }
    public void setNomes(String nome) { this.nome = nome; }

    public String getEmail() { return email;}
    public void setEmail(String email) { this.email = email;} 

    public String getSenha() { return senha ;}
    public void setSenha(String senha) {this.senha = senha; }

}
