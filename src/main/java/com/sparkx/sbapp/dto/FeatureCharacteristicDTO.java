package com.sparkx.sbapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeatureCharacteristicDTO {
    private String id;
    private String name;
    private String value;
    private String baseType;
    private String schemaLocation;
    private String type;
}