package com.sparkx.sbapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RelatedPartyDTO {
    private String id;
    private String href;
    private String name;
    private String role;
    private String baseType;
    private String schemaLocation;
    private String type;
    private String referredType;

    // Getters and Setters
}