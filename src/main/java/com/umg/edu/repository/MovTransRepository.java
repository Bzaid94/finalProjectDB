package com.umg.edu.repository;

import com.umg.edu.entity.MovTrans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovTransRepository extends JpaRepository<MovTrans, Long> {
}
