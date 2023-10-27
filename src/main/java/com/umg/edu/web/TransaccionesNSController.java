package com.umg.edu.web;

import com.umg.edu.entity.TransaccionesNS;
import com.umg.edu.service.TransaccionesNSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transacciones_ns")
public class TransaccionesNSController {

    @Autowired
    private TransaccionesNSService transaccionesNSService;

    @GetMapping
    public List<TransaccionesNS> getAllTransaccionesNS() {
        return transaccionesNSService.getAllTransaccionesNS();
    }

    @GetMapping("/{id}")
    public TransaccionesNS getTransaccionesNSById(@PathVariable Long id) {
        return transaccionesNSService.getTransaccionesNSById(id);
    }

    @PostMapping
    public TransaccionesNS saveTransaccionesNS(@RequestBody TransaccionesNS transaccionesNS) {
        return transaccionesNSService.saveTransaccionesNS(transaccionesNS);
    }

    @DeleteMapping("/{id}")
    public void deleteTransaccionesNS(@PathVariable Long id) {
        transaccionesNSService.deleteTransaccionesNS(id);
    }
}
