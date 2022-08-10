package com.db.temaSpital.controller;

import com.db.temaSpital.models.Doctor;
import com.db.temaSpital.models.Patient;
import com.db.temaSpital.models.Specialty;
import com.db.temaSpital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("/patients/all")
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @GetMapping("/patients/all?cnp={cnp}")
    public List<Patient> getByCnp(@RequestParam String cnp){
        return patientService.getByCnp(cnp);
    }
}