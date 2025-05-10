package com.sparkx.sbapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class ServiceRelationship {

    @Id
    private String id;
    private String relationshipType;
    private String service;
    private String baseType;
    private String schemaLocation;
    private String type;
}