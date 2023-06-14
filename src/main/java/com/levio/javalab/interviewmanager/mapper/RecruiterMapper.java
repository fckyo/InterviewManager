package com.levio.javalab.interviewmanager.mapper;

import com.levio.javalab.interviewmanager.lang.mapper.EntityToDTOMapper;
import com.levio.javalab.interviewmanager.dto.RecruiterDTO;
import com.levio.javalab.interviewmanager.entity.Recruiter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface RecruiterMapper extends EntityToDTOMapper<Recruiter, RecruiterDTO> {
    @Override
    @Mapping(target = "id", source = "entity.id")
    @Mapping(target = "name", source = "entity.name")
    @Mapping(target = "lastName", source = "entity.lastName")
    @Mapping(target = "email", source = "entity.email")
    RecruiterDTO toDTO(Recruiter entity);

    @Override
    @Mapping(target = "id", source = "dto.id")
    @Mapping(target = "name", source = "dto.name")
    @Mapping(target = "lastName", source = "dto.lastName")
    @Mapping(target = "email", source = "dto.email")
    Recruiter toEntity(RecruiterDTO dto);

    @Override
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "email", source = "email")
    Recruiter updateExistingEntity(RecruiterDTO dto, @MappingTarget Recruiter entity);
}
