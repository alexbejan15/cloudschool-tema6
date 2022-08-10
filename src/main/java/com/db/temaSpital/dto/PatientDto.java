package com.db.temaSpital.dto;

import com.db.temaSpital.models.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientDto {
    String cnp;
    String doctorName;

    public PatientDto(Patient patient){
        this.cnp=patient.getCnp();
        this.doctorName=patient.getDoctor().getName();
    }
}