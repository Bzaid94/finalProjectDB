package com.umg.edu.web;

import com.umg.edu.entity.Puesto;
import com.umg.edu.service.PuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/puestos")
public class PuestoController {

    @Autowired
    private PuestoService puestoService;

    @GetMapping
    public List<Puesto> getAllPuestos() {
        return puestoService.getAllPuestos();
    }

    @GetMapping("/{id}")
    public Puesto getPuestoById(@PathVariable Long id) {
        return puestoService.getPuestoById(id);
    }

    @PostMapping
    public Puesto savePuesto(@RequestBody Puesto puesto) {
        return puestoService.savePuesto(puesto);
    }

    @DeleteMapping("/{id}")
    public void deletePuesto(@PathVariable Long id) {
        puestoService.deletePuesto(id);
    }
}
