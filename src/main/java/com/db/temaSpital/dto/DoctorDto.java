package com.db.temaSpital.dto;

import com.db.temaSpital.models.Doctor;
import com.db.temaSpital.models.Specialty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDto {
    String name;
    Specialty specialty;

    public DoctorDto(Doctor doctor){
        this.name=doctor.getName();
        this.specialty=doctor.getSpecialty();
    }
}