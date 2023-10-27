package com.umg.edu.web;

import com.umg.edu.entity.Trabajador;
import com.umg.edu.service.TrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trabajadores")
public class TrabajadorController {

    @Autowired
    private TrabajadorService trabajadorService;

    @GetMapping
    public List<Trabajador> getAllTrabajadores() {
        return trabajadorService.getAllTrabajadores();
    }

    @GetMapping("/{id}")
    public Trabajador getTrabajadorById(@PathVariable Long id) {
        return trabajadorService.getTrabajadorById(id);
    }

    @PostMapping
    public Trabajador saveTrabajador(@RequestBody Trabajador trabajador) {
        return trabajadorService.saveTrabajador(trabajador);
    }

    @DeleteMapping("/{id}")
    public void deleteTrabajador(@PathVariable Long id) {
        trabajadorService.deleteTrabajador(id);
    }
}

