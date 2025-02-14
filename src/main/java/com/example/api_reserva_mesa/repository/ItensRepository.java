package com.example.api_reserva_mesa.repository;


import com.example.api_reserva_mesa.entity.ItensEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface ItensRepository extends JpaRepository<ItensEntity, Long>{
}
