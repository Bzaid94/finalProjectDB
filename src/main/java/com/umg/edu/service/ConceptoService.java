package com.umg.edu.service;

import com.umg.edu.entity.Concepto;
import com.umg.edu.repository.ConceptoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConceptoService {

    @Autowired
    private ConceptoRepository conceptoRepository;

    public List<Concepto> getAllConceptos() {
        return conceptoRepository.findAll();
    }

    public Concepto getConceptoById(Long id) {
        return conceptoRepository.findById(id).orElse(null);
    }

    public Concepto saveConcepto(Concepto concepto) {
        return conceptoRepository.save(concepto);
    }

    public void deleteConcepto(Long id) {
        conceptoRepository.deleteById(id);
    }
}

