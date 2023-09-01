package com.example.hotelsoftek.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Huesped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private String nacimiento;
    private String nacionalidad;
    private String telefono;
    @OneToMany//(mappedBy = "id")
    @JoinColumn(name="id")
    private List<Reserva> reservas = new ArrayList<>();

}
