package com.umg.edu.repository;

import com.umg.edu.entity.HistoricoSueldo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoSueldoRepository extends JpaRepository<HistoricoSueldo, Long> {
}
