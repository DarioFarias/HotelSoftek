package com.example.hotelsoftek.repository;

import com.example.hotelsoftek.model.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHuespedRepo extends JpaRepository<Huesped, Integer> {
}
