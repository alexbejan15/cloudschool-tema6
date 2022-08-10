package com.db.temaSpital.mapper;

import com.db.temaSpital.dto.DoctorDto;
import com.db.temaSpital.models.Doctor;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface DoctorMapper {
    DoctorDto todoctorDto (Doctor doctor);

}