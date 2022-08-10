package com.db.temaSpital.service;

import com.db.temaSpital.exceptions.NoDoctorException;
import com.db.temaSpital.models.Doctor;
import com.db.temaSpital.models.Patient;
import com.db.temaSpital.models.Specialty;
import com.db.temaSpital.repository.DoctorRepository;
import com.db.temaSpital.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    final DoctorRepository doctorRepository;
    final PatientRepository patientRepository;

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public void addPatient(Integer doctorId, Integer patientId) throws NoDoctorException {
        Doctor d = doctorRepository.getById(doctorId);
        if (d == null)
            throw new NoDoctorException();
        else{
            Patient p=patientRepository.getById(patientId);
            if(p!=null){
                d.addPatient(p);
            }
        }
    }
    public void addDoctor(Doctor doctor){
        doctorRepository.save(doctor);
    }

    public List<Doctor> getAllBySpecialty(Specialty specialty){
        return doctorRepository.getAllBySpecialty(specialty);
    }

}