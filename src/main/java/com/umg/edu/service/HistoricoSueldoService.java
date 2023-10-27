package com.umg.edu.service;

import com.umg.edu.entity.HistoricoSueldo;
import com.umg.edu.repository.HistoricoSueldoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoSueldoService {

    @Autowired
    private HistoricoSueldoRepository historicoSueldoRepository;

    public List<HistoricoSueldo> getAllHistoricoSueldos() {
        return historicoSueldoRepository.findAll();
    }

    public HistoricoSueldo getHistoricoSueldoById(Long id) {
        return historicoSueldoRepository.findById(id).orElse(null);
    }

    public HistoricoSueldo saveHistoricoSueldo(HistoricoSueldo historicoSueldo) {
        return historicoSueldoRepository.save(historicoSueldo);
    }

    public void deleteHistoricoSueldo(Long id) {
        historicoSueldoRepository.deleteById(id);
    }
}

