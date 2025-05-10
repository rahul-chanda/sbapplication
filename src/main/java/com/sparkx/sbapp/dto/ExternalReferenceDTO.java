package com.sparkx.sbapp.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalReferenceDTO {
    @Id
    private String id;
    private String externalReferenceType;
    private String name;
    private String baseType;
    private String schemaLocation;
    private String type;

    // Getters and Setters
}