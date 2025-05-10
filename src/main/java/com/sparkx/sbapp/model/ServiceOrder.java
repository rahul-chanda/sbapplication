package com.sparkx.sbapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class ServiceOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String href;
    private LocalDateTime cancellationDate;
    private String cancellationReason;
    private String category;
    private LocalDateTime completionDate;
    private String description;
    private LocalDateTime expectedCompletionDate;
    private String externalId;
    private String notificationContact;
    private LocalDateTime orderDate;
    private String priority;
    private Integer version;
    private LocalDateTime requestedCompletionDate;
    private LocalDateTime requestedStartDate;
    private LocalDateTime startDate;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ExternalReference> externalReference;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Note> note;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderRelationship> orderRelationship;

    @OneToMany(cascade = CascadeType.ALL)
    private List<RelatedParty> relatedParty;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ServiceOrderItem> serviceOrderItem;

    private String state;
}