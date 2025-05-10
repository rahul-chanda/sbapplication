package com.sparkx.sbapp.mapper;

import com.sparkx.sbapp.dto.AppointmentDTO;
import com.sparkx.sbapp.model.Appointment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AppointmentMapper {

    AppointmentDTO toDto(Appointment appointment);
    Appointment toEntity(AppointmentDTO appointmentDTO);
}