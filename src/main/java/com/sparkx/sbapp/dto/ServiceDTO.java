package com.sparkx.sbapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDTO {
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
    private List<FeatureDTO> feature;
    private List<NoteDTO> note;
    private List<RelatedEntityDTO> relatedEntity;
    private List<RelatedPartyDTO> relatedParty;
    private List<ServiceCharacteristicDTO> serviceCharacteristic;
    private List<ServiceRelationshipDTO> serviceRelationship;
    private ServiceSpecificationDTO serviceSpecification;
    private String state;
    private List<String> supportingService;
    private String baseType;
    private String schemaLocation;
    private String type;
    private String referredType;

    // Getters and Setters
}