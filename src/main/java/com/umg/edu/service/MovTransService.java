package com.umg.edu.service;

import com.umg.edu.entity.MovTrans;
import com.umg.edu.repository.MovTransRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovTransService {

    @Autowired
    private MovTransRepository movTransRepository;

    public List<MovTrans> getAllMovTrans() {
        return movTransRepository.findAll();
    }

    public MovTrans getMovTransById(Long id) {
        return movTransRepository.findById(id).orElse(null);
    }

    public MovTrans saveMovTrans(MovTrans movTrans) {
        return movTransRepository.save(movTrans);
    }

    public void deleteMovTrans(Long id) {
        movTransRepository.deleteById(id);
    }
}
