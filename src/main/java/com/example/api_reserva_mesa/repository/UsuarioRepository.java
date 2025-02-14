package com.example.api_reserva_mesa.repository;

import com.example.api_reserva_mesa.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsersEntity, Long> {

    UsersEntity findByEmail(String email);

    
    
}
