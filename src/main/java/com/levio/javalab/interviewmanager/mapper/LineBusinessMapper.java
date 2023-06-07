package com.levio.javalab.interviewmanager.linebusiness.mapper;

import com.levio.javalab.interviewmanager.lang.mapper.EntityToDTOMapper;
import com.levio.javalab.interviewmanager.dto.LineBusinessDTO;
import com.levio.javalab.interviewmanager.entity.LineBusiness;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface LineBusinessMapper extends EntityToDTOMapper<LineBusiness, LineBusinessDTO> {
    @Override
    @Mapping(target = "id", source = "entity.id")
    @Mapping(target = "name", source = "entity.name")
    LineBusinessDTO toDTO(LineBusiness entity);

    @Override
    @Mapping(target = "id", source = "dto.id")
    @Mapping(target = "name", source = "dto.name")
    LineBusiness toEntity(LineBusinessDTO dto);

    @Override
    @Mapping(target = "name", source = "name")
    LineBusiness updateExistingEntity(LineBusinessDTO lineBusinessDTO, @MappingTarget LineBusiness lineBusiness);
}
