package com.sparkx.sbapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RelatedEntity {

    @Id
    private String id;
    private String href;
    private String name;
    private String role;
    private String baseType;
    private String schemaLocation;
    private String type;
    private String referredType;
}