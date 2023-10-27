package com.umg.edu.service;

import com.umg.edu.entity.TransaccionesNS;
import com.umg.edu.repository.TransaccionesNSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionesNSService {

    @Autowired
    private TransaccionesNSRepository transaccionesNSRepository;

    public List<TransaccionesNS> getAllTransaccionesNS() {
        return transaccionesNSRepository.findAll();
    }

    public TransaccionesNS getTransaccionesNSById(Long id) {
        return transaccionesNSRepository.findById(id).orElse(null);
    }

    public TransaccionesNS saveTransaccionesNS(TransaccionesNS transaccionesNS) {
        return transaccionesNSRepository.save(transaccionesNS);
    }

    public void deleteTransaccionesNS(Long id) {
        transaccionesNSRepository.deleteById(id);
    }
}

