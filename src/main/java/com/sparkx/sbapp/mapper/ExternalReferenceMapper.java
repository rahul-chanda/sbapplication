package com.sparkx.sbapp.mapper;

import com.sparkx.sbapp.dto.ExternalReferenceDTO;
import com.sparkx.sbapp.model.ExternalReference;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExternalReferenceMapper {

    ExternalReference toEntity(ExternalReferenceDTO dto);

    ExternalReferenceDTO toDto(ExternalReference entity);
}
