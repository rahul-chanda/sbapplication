package com.sparkx.sbapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceCharacteristicDTO {
    private String id;
    private String name;
    private String valueType;
    private String value;
    private String baseType;
    private String schemaLocation;
    private String type;
}