package com.sparkx.sbapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FeatureCharacteristic {

    @Id
    private Long id;
    private String name;
    private String valueField;
    private String baseType;
    private String schemaLocation;
    private String type;

    // Getters and Setters
}
