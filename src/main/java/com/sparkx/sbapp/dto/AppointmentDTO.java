package com.sparkx.sbapp.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDTO {
    @Id
    private String id;
    private String href;
    private String appointmentType;
    private String appointmentDateTime;
    private String appointmentState;
    private String baseType;
    private String schemaLocation;
    private String type;
    private String referredType;

    // Getters and Setters
}
