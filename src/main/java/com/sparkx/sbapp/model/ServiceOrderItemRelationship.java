package com.sparkx.sbapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ServiceOrderItemRelationship {

    @Id
    private String id;
    private String relationshipType;

    private String baseType;
    private String schemaLocation;
    private String type;
}