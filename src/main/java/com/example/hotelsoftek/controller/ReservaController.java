package com.example.hotelsoftek.controller;

import com.example.hotelsoftek.model.Reserva;
import com.example.hotelsoftek.service.ReservaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/reserva")
@RequiredArgsConstructor
public class ReservaController {
    private final ReservaServiceImpl servicioREST;

    @GetMapping
    public ResponseEntity<List<Reserva>> listarTodo(){
        List<Reserva> response = servicioREST.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Reserva> crear(@RequestBody Reserva reserva){
        Reserva response = servicioREST.save(reserva);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Reserva> actualizar(@RequestBody Reserva reserva, @PathVariable Integer id){
        reserva.setId(id);
        Reserva response = servicioREST.save(reserva);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        servicioREST.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
