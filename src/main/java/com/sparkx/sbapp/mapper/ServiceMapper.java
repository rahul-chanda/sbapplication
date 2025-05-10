package com.sparkx.sbapp.mapper;

import com.sparkx.sbapp.dto.ServiceDTO;
import com.sparkx.sbapp.dto.ServiceOrderItemDTO;
import com.sparkx.sbapp.model.Service;
import com.sparkx.sbapp.model.ServiceOrderItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServiceMapper {

    ServiceDTO toDto(Service service);
    Service toEntity(ServiceDTO serviceDTO);
}