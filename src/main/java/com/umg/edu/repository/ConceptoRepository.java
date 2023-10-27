package com.umg.edu.repository;

import com.umg.edu.entity.Concepto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConceptoRepository extends JpaRepository<Concepto, Long> {
}
