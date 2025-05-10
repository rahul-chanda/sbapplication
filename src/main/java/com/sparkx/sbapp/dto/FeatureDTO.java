package com.sparkx.sbapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeatureDTO {

    private String id;
    private boolean isBundle;
    private boolean isEnabled;
    private String name;
    private List<FeatureCharacteristicDTO> featureCharacteristic;
    private List<FeatureRelationshipDTO> featureRelationship;
    private String baseType;
    private String schemaLocation;
    private String type;
}