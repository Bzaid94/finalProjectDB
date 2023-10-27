package com.umg.edu.service;

import com.umg.edu.entity.Trabajador;
import com.umg.edu.repository.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajadorService {

    @Autowired
    private TrabajadorRepository trabajadorRepository;

    public List<Trabajador> getAllTrabajadores() {
        return trabajadorRepository.findAll();
    }

    public Trabajador getTrabajadorById(Long id) {
        return trabajadorRepository.findById(id).orElse(null);
    }

    public Trabajador saveTrabajador(Trabajador trabajador) {
        return trabajadorRepository.save(trabajador);
    }

    public void deleteTrabajador(Long id) {
        trabajadorRepository.deleteById(id);
    }
}

