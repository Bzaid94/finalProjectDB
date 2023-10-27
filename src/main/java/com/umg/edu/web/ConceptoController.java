package com.umg.edu.web;

import com.umg.edu.entity.Concepto;
import com.umg.edu.service.ConceptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conceptos")
public class ConceptoController {

    @Autowired
    private ConceptoService conceptoService;

    @GetMapping
    public List<Concepto> getAllConceptos() {
        return conceptoService.getAllConceptos();
    }

    @GetMapping("/{id}")
    public Concepto getConceptoById(@PathVariable Long id) {
        return conceptoService.getConceptoById(id);
    }

    @PostMapping
    public Concepto saveConcepto(@RequestBody Concepto concepto) {
        return conceptoService.saveConcepto(concepto);
    }

    @DeleteMapping("/{id}")
    public void deleteConcepto(@PathVariable Long id) {
        conceptoService.deleteConcepto(id);
    }
}

