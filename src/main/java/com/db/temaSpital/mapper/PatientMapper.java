package com.db.temaSpital.mapper;

import com.db.temaSpital.dto.PatientDto;
import com.db.temaSpital.models.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface PatientMapper {
    PatientDto topatientDto (Patient patient);

}