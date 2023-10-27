package com.umg.edu.web;

import com.umg.edu.entity.HistoricoSueldo;
import com.umg.edu.service.HistoricoSueldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/historico_sueldos")
public class HistoricoSueldoController {

    @Autowired
    private HistoricoSueldoService historicoSueldoService;

    @GetMapping
    public List<HistoricoSueldo> getAllHistoricoSueldos() {
        return historicoSueldoService.getAllHistoricoSueldos();
    }

    @GetMapping("/{id}")
    public HistoricoSueldo getHistoricoSueldoById(@PathVariable Long id) {
        return historicoSueldoService.getHistoricoSueldoById(id);
    }

    @PostMapping
    public HistoricoSueldo saveHistoricoSueldo(@RequestBody HistoricoSueldo historicoSueldo) {
        return historicoSueldoService.saveHistoricoSueldo(historicoSueldo);
    }

    @DeleteMapping("/{id}")
    public void deleteHistoricoSueldo(@PathVariable Long id) {
        historicoSueldoService.deleteHistoricoSueldo(id);
    }
}

