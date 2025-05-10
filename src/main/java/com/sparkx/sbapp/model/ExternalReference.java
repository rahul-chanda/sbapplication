package com.sparkx.sbapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ExternalReference {

    @Id
    private String id;
    private String externalReferenceType;
    private String name;
    private String baseType;
    private String schemaLocation;
    private String type;
}