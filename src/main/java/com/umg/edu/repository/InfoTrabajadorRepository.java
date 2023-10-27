package com.umg.edu.repository;

import com.umg.edu.entity.InfoTrabajador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoTrabajadorRepository extends JpaRepository<InfoTrabajador, Long> {
}
