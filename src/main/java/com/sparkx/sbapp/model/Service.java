package com.sparkx.sbapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Service {

    @Id
    private String id;
    private String href;
    private String category;
    private String description;
    private LocalDateTime endDate;
    private boolean hasStarted;
    private boolean isBundle;
    private boolean isServiceEnabled;
    private boolean isStateful;
    private String name;
    private String serviceDate;
    private String serviceType;
    private LocalDateTime startDate;
    private String startMode;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Feature> feature;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Note> note;


    @OneToMany(cascade = CascadeType.ALL)
    private List<RelatedEntity> relatedEntity;

    @OneToMany(cascade = CascadeType.ALL)
    private List<RelatedParty> relatedParty;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ServiceCharacteristic> serviceCharacteristic;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ServiceRelationship> serviceRelationship;

    @OneToOne(cascade = CascadeType.ALL)
    private ServiceSpecification serviceSpecification;

    private String state;
}