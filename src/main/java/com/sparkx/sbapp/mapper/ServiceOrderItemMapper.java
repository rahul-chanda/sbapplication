package com.sparkx.sbapp.mapper;

import com.sparkx.sbapp.dto.ServiceOrderItemDTO;
import com.sparkx.sbapp.model.ServiceOrderItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")  // "spring" makes it injectable via @Autowired
public interface ServiceOrderItemMapper {

    ServiceOrderItem toEntity(ServiceOrderItemDTO serviceOrderItemDTO);

    ServiceOrderItemDTO toDTO(ServiceOrderItem serviceOrderItem);
}
