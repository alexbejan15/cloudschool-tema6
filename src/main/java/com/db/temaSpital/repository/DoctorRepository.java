package com.db.temaSpital.repository;

import com.db.temaSpital.models.Doctor;
import com.db.temaSpital.models.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{
    List<Doctor> findAll();
    Doctor getById(Integer id);

    List<Doctor> getAllBySpecialty(Specialty specialty);
}