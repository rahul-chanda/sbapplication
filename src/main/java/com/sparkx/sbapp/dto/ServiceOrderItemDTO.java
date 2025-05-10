package com.sparkx.sbapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrderItemDTO {
    private String id;
    private Integer quantity;
    private String action;
    private AppointmentDTO appointment;
    private ServiceDTO service;
    private List<ServiceOrderItemRelationshipDTO> serviceOrderItemRelationship;
    private String state;
    private String baseType;
    private String schemaLocation;
    private String type;

    // Getters and Setters
}