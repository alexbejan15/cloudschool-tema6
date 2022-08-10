package com.db.temaSpital.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue
    Integer id;
    @NotNull
    String name;
    @OneToMany
    List<Patient> patientList=new ArrayList<>();
    Specialty specialty;

    public void addPatient(Patient patient){
        this.patientList.add(patient);
    }
}