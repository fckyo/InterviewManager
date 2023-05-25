package com.levio.javalab.interviewmanager.techadvisor.mapper;

import com.levio.javalab.interviewmanager.lang.mapper.EntityToDTOMapper;
import com.levio.javalab.interviewmanager.techadvisor.dto.TechnicalAdvisorDTO;
import com.levio.javalab.interviewmanager.techadvisor.entity.TechnicalAdvisor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TechnicalAdvisorMapper extends EntityToDTOMapper<TechnicalAdvisor, TechnicalAdvisorDTO> {
    @Mapping(target = "id", source = "entity.id")
    @Mapping(target = "name", source = "entity.name")
    @Mapping(target = "lastName", source = "entity.lastName")
    @Mapping(target = "email", source = "entity.email")
    @Mapping(target = "active", source = "entity.active")
    @Mapping(target = "jobPositionId", source = "entity.currentJobPosition.id")
    @Mapping(target = "jobPositionDescription", source = "entity.currentJobPosition.description")
    @Mapping(target = "lineBusinessId", source = "entity.currentJobPosition.lineBusiness.id")
    @Mapping(target = "lineBusinessDescription", source = "entity.currentJobPosition.lineBusiness.name")
    TechnicalAdvisorDTO toDTO(TechnicalAdvisor entity);

    @Mapping(target = "id", source = "dto.id")
    @Mapping(target = "name", source = "dto.name")
    @Mapping(target = "lastName", source = "dto.lastName")
    @Mapping(target = "email", source = "dto.email")
    @Mapping(target = "active", source = "dto.active")
    @Mapping(target = "currentJobPosition.id", source = "dto.jobPositionId")
    @Mapping(target = "currentJobPosition.lineBusiness.id", source = "dto.lineBusinessId")
    TechnicalAdvisor toEntity(TechnicalAdvisorDTO dto);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name", source = "name")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "active", source = "active")
    @Mapping(target = "currentJobPosition.id", source = "jobPositionId")
    @Mapping(target = "currentJobPosition.lineBusiness.id", ignore = true)
    TechnicalAdvisor updateExistingEntity(TechnicalAdvisorDTO technicalAdvisorDTO, @MappingTarget TechnicalAdvisor technicalAdvisor);
}
