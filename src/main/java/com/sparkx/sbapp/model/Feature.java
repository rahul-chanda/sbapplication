package com.sparkx.sbapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Feature {

    @Id
    private String id;
    private boolean isBundle;
    private boolean isEnabled;
    private String name;

    private String baseType;
    private String schemaLocation;
    private String type;
}