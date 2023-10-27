package com.umg.edu.repository;

import com.umg.edu.entity.ViewSueldos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SueldosViewRepository extends JpaRepository<ViewSueldos, Long> {
}
