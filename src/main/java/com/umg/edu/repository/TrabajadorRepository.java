package com.umg.edu.repository;

import com.umg.edu.entity.Trabajador;
import com.umg.edu.entity.TrabajadorReporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrabajadorRepository extends JpaRepository<Trabajador, Long> {
}
