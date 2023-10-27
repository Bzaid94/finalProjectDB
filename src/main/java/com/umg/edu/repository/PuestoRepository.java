package com.umg.edu.repository;

import com.umg.edu.entity.Puesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuestoRepository extends JpaRepository<Puesto, Long> {
}
