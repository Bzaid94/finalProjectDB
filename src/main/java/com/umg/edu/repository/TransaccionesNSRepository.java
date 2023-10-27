package com.umg.edu.repository;

import com.umg.edu.entity.TransaccionesNS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionesNSRepository extends JpaRepository<TransaccionesNS, Long> {
}
