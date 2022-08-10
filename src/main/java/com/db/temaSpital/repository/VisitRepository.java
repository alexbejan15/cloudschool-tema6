package com.db.temaSpital.repository;

import com.db.temaSpital.models.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisitRepository extends JpaRepository<Visit, Integer> {
    List<Visit> findAll();
}