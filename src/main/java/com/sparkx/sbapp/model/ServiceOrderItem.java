package com.sparkx.sbapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class ServiceOrderItem {

    @Id
    private String id; // Manually assigned ID

    private int quantity;
    private String action;

    @OneToOne(cascade = CascadeType.ALL)
    private Appointment appointment;

    @OneToOne(cascade = CascadeType.ALL)
    private Service service;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ServiceOrderItemRelationship> serviceOrderItemRelationship;

    private String state;
}