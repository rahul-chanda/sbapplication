package com.sparkx.sbapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class ServiceCharacteristic {

    @Id
    private String id;
    private String name;
    private String valueType;
    private String valueFeild;
    private String baseType;
    private String schemaLocation;
    private String type;
}