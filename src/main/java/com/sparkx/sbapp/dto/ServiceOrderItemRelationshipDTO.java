package com.sparkx.sbapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrderItemRelationshipDTO {
    private String id;
    private String name;
    private String relationshipType;
    private String baseType;
    private String schemaLocation;
    private String type;
    private RelatedEntityDTO relatedEntity;
    private ExternalReferenceDTO externalReference;
    private FeatureCharacteristicDTO featureCharacteristic;
    private FeatureRelationshipDTO featureRelationship;

    // Getters and Setters
}
