package com.umg.edu.service;

import com.umg.edu.entity.Puesto;
import com.umg.edu.repository.PuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PuestoService {

    @Autowired
    private PuestoRepository puestoRepository;

    public List<Puesto> getAllPuestos() {
        return puestoRepository.findAll();
    }

    public Puesto getPuestoById(Long id) {
        return puestoRepository.findById(id).orElse(null);
    }

    public Puesto savePuesto(Puesto puesto) {
        return puestoRepository.save(puesto);
    }

    public void deletePuesto(Long id) {
        puestoRepository.deleteById(id);
    }
}

