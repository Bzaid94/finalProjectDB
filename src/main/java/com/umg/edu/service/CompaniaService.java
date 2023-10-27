package com.umg.edu.service;

import com.umg.edu.entity.Compania;
import com.umg.edu.repository.CompaniaRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class CompaniaService {
    @Autowired
    private CompaniaRepository companiaRepository;

    public List<Compania> findAll() {
        return companiaRepository.findAll();
    }

    public Optional<Compania> findById(Long id) {
        return companiaRepository.findById(id);
    }

    public Compania save(Compania compania) {
        return companiaRepository.save(compania);
    }

    public void deleteById(Long id) {
        companiaRepository.deleteById(id);
    }
}