package com.sparkx.sbapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceRelationshipDTO {
    private String relationshipType;
    private String service;
    private String baseType;
    private String schemaLocation;
    private String type;
}