package com.sparkx.sbapp.mapper;

import com.sparkx.sbapp.dto.ServiceOrderDTO;
import com.sparkx.sbapp.model.ServiceOrder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        AppointmentMapper.class,
        ServiceMapper.class,
        ServiceOrderItemRelationshipMapper.class,
        ServiceOrderItemMapper.class,
        ExternalReferenceMapper.class
})
public interface ServiceOrderMapper {

    ServiceOrderDTO toDto(ServiceOrder serviceOrder);

    ServiceOrder toEntity(ServiceOrderDTO serviceOrderDTO);
}