package com.example.hotelsoftek.service;

import com.example.hotelsoftek.model.Huesped;
import com.example.hotelsoftek.repository.IHuespedRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //para Inyeccion de dependencias
public class HuespedServiceImpl implements IGenericService<Huesped, Integer>{
    //Inyeccion de dependencias por patron de diseño singleton
    //@Autowired
    private final IHuespedRepo repo;
    @Override
    public List<Huesped> findAll() {
        return repo.findAll();
    }

    @Override
    public Huesped save(Huesped huesped) {
        return repo.save(huesped);
    }

    @Override
    public Huesped update(Huesped huesped, Integer id) {
        huesped.setId(id);
        return repo.save(huesped);
    }

    @Override
    public void deleteById(Integer id) {
        repo.deleteById(id);
    }
}
