package com.umg.edu.web;

import com.umg.edu.entity.InfoTrabajador;
import com.umg.edu.service.InfoTrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/info_trabajadores")
public class InfoTrabajadorController {

    @Autowired
    private InfoTrabajadorService infoTrabajadorService;

    @GetMapping
    public List<InfoTrabajador> getAllInfoTrabajadores() {
        return infoTrabajadorService.getAllInfoTrabajadores();
    }

    @GetMapping("/{id}")
    public InfoTrabajador getInfoTrabajadorById(@PathVariable Long id) {
        return infoTrabajadorService.getInfoTrabajadorById(id);
    }

    @PostMapping
    public InfoTrabajador saveInfoTrabajador(@RequestBody InfoTrabajador infoTrabajador) {
        return infoTrabajadorService.saveInfoTrabajador(infoTrabajador);
    }

    @DeleteMapping("/{id}")
    public void deleteInfoTrabajador(@PathVariable Long id) {
        infoTrabajadorService.deleteInfoTrabajador(id);
    }
}
