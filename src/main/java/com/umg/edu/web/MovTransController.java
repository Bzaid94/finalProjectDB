package com.umg.edu.web;

import com.umg.edu.entity.MovTrans;
import com.umg.edu.service.MovTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mov_trans")
public class MovTransController {

    @Autowired
    private MovTransService movTransService;

    @GetMapping
    public List<MovTrans> getAllMovTrans() {
        return movTransService.getAllMovTrans();
    }

    @GetMapping("/{id}")
    public MovTrans getMovTransById(@PathVariable Long id) {
        return movTransService.getMovTransById(id);
    }

    @PostMapping
    public MovTrans saveMovTrans(@RequestBody MovTrans movTrans) {
        return movTransService.saveMovTrans(movTrans);
    }

    @DeleteMapping("/{id}")
    public void deleteMovTrans(@PathVariable Long id) {
        movTransService.deleteMovTrans(id);
    }
}
