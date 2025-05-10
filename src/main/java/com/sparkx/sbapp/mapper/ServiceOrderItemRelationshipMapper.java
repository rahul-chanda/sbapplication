package com.sparkx.sbapp.mapper;

import com.sparkx.sbapp.dto.ServiceOrderItemRelationshipDTO;
import com.sparkx.sbapp.model.ServiceOrderItemRelationship;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServiceOrderItemRelationshipMapper {

    ServiceOrderItemRelationshipDTO toDto(ServiceOrderItemRelationship serviceOrderItemRelationship);
    ServiceOrderItemRelationship toEntity(ServiceOrderItemRelationshipDTO serviceOrderItemRelationshipDTO);
}