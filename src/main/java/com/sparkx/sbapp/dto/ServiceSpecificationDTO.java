package com.sparkx.sbapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceSpecificationDTO {
    private String id;
    private String href;
    private String name;
    private String version;
    private String baseType;
    private String schemaLocation;
    private String type;
    private String referredType;
}