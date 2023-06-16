package com.levio.javalab.interviewmanager.mapper;

import com.levio.javalab.interviewmanager.dto.JobPositionDTO;
import com.levio.javalab.interviewmanager.entity.JobPosition;
import com.levio.javalab.interviewmanager.lang.mapper.EntityToDTOMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface JobPositionMapper extends EntityToDTOMapper<JobPosition, JobPositionDTO> {

    @Override
    @Mapping(target = "id", source = "entity.id")
    @Mapping(target = "description", source = "entity.description")
    @Mapping(target = "lineBusinessId", source = "entity.lineBusiness.id")
    @Mapping(target = "lineBusinessName", source = "entity.lineBusiness.name")
    @Mapping(target = "superiorId", source = "entity.superiorId")
    @Mapping(target = "levelExpertise", source = "entity.levelExpertise")
    JobPositionDTO toDTO(JobPosition entity);

    @Override
    @Mapping(target = "id", source = "dto.id")
    @Mapping(target = "description", source = "dto.description")
    @Mapping(target = "lineBusiness.id", source = "dto.lineBusinessId")
    @Mapping(target = "lineBusiness.name", source = "dto.lineBusinessName")
    @Mapping(target = "superiorId", source = "dto.superiorId")
    @Mapping(target = "levelExpertise", source = "dto.levelExpertise")
    JobPosition toEntity(JobPositionDTO dto);

    @Override
    @Mapping(target = "id", source = "id")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "lineBusiness.id", source = "lineBusinessId")
    @Mapping(target = "superiorId", source = "superiorId")
    @Mapping(target = "levelExpertise", source = "levelExpertise")
    JobPosition updateExistingEntity(JobPositionDTO dto, @MappingTarget JobPosition entity);
}
