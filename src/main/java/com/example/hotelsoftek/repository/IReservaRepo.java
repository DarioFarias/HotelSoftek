package com.example.hotelsoftek.repository;

import com.example.hotelsoftek.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservaRepo extends JpaRepository<Reserva, Integer> {
}
