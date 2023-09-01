package com.example.hotelsoftek.service;

import com.example.hotelsoftek.model.Reserva;
import com.example.hotelsoftek.repository.IReservaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //para Inyeccion de dependencias
public class ReservaServiceImpl implements IGenericService<Reserva, Integer>{
    //Inyeccion de dependencias por patron de diseño singleton
    //@Autowired
    private final IReservaRepo repo;
    @Override
    public List<Reserva> findAll() {
        return repo.findAll();
    }

    @Override
    public Reserva save(Reserva reserva) {
        return repo.save(reserva);
    }

    @Override
    public Reserva update(Reserva reserva, Integer id) {
        reserva.setId(id);
        return repo.save(reserva);
    }

    @Override
    public void deleteById(Integer id) {
        repo.deleteById(id);
    }
}
