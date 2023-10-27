package com.umg.edu.web;

import com.umg.edu.entity.Compania;
import com.umg.edu.service.CompaniaService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/companias")
public class CompaniaController {

    @Autowired
    private CompaniaService companiaService;

    @GetMapping
    public List<Compania> getAllCompanias() {
        return companiaService.findAll();
    }

    @GetMapping("/{id}")
    public Compania getCompaniaById(@PathVariable Long id) {
        return companiaService.findById(id).orElse(null);  // return null or handle not found situation
    }

    @PostMapping
    public Compania createCompania(@RequestBody Compania compania) {
        return companiaService.save(compania);
    }

    @PutMapping("/{id}")
    public Compania updateCompania(@PathVariable Long id, @RequestBody Compania compania) {
        // handle the case if not found
        compania.setId_compania(id);
        return companiaService.save(compania);
    }

    @DeleteMapping("/{id}")
    public void deleteCompania(@PathVariable Long id) {
        companiaService.deleteById(id);
    }
}
