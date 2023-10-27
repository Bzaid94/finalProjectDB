package com.umg.edu.service;

import com.umg.edu.entity.InfoTrabajador;
import com.umg.edu.repository.InfoTrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoTrabajadorService {

    @Autowired
    private InfoTrabajadorRepository infoTrabajadorRepository;

    public List<InfoTrabajador> getAllInfoTrabajadores() {
        return infoTrabajadorRepository.findAll();
    }

    public InfoTrabajador getInfoTrabajadorById(Long id) {
        return infoTrabajadorRepository.findById(id).orElse(null);
    }

    public InfoTrabajador saveInfoTrabajador(InfoTrabajador infoTrabajador) {
        return infoTrabajadorRepository.save(infoTrabajador);
    }

    public void deleteInfoTrabajador(Long id) {
        infoTrabajadorRepository.deleteById(id);
    }
}
