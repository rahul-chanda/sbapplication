package com.sparkx.sbapp.dto;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrderDTO {
    private String id;
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
    private LocalDateTime requestedCompletionDate;
    private LocalDateTime requestedStartDate;
    private LocalDateTime startDate;
    private List<ExternalReferenceDTO> externalReference;
    private List<NoteDTO> note;
    private List<OrderRelationshipDTO> orderRelationship;
    private List<RelatedPartyDTO> relatedParty;
    private List<ServiceOrderItemDTO> serviceOrderItem;
    private String state;
    private Integer version;
    private String baseType;
    private String schemaLocation;
    private String type;

    // Getters and Setters
}