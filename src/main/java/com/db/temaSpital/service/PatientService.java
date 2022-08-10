package com.db.temaSpital.service;

import com.db.temaSpital.models.Doctor;
import com.db.temaSpital.models.Patient;
import com.db.temaSpital.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    final PatientRepository patientRepository;

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    public List<Patient> getByCnp(String cnp){
        return patientRepository.getByCnp(cnp);
    }
}