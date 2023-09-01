package com.example.hotelsoftek.controller;

import com.example.hotelsoftek.model.Huesped;
import com.example.hotelsoftek.service.HuespedServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/huespedes")
@RequiredArgsConstructor
public class HuespedController {
    private final HuespedServiceImpl servicioREST;

    @GetMapping
    public ResponseEntity<List<Huesped>> listarTodo(){
        List<Huesped> response = servicioREST.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Huesped> crear(@RequestBody Huesped huesped){
        Huesped response = servicioREST.save(huesped);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Huesped> actualizar(@RequestBody Huesped huesped, @PathVariable Integer id){
        huesped.setId(id);
        Huesped response = servicioREST.save(huesped);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        servicioREST.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
