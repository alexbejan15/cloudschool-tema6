package com.db.temaSpital.repository;

import com.db.temaSpital.models.Doctor;
import com.db.temaSpital.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    List<Patient> findAll();
    Patient getById(Integer id);

    List<Patient> getAllByDoctor(Doctor doctor);
    List<Patient> getByCnp(String cnp);
}