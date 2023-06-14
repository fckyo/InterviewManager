package com.levio.javalab.interviewmanager.mapper;

import com.levio.javalab.interviewmanager.dto.CandidateDTO;
import com.levio.javalab.interviewmanager.entity.Candidate;
import com.levio.javalab.interviewmanager.lang.mapper.EntityToDTOMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CandidateMapper extends EntityToDTOMapper<Candidate, CandidateDTO> {
    @Override
    @Mapping(target = "id", source = "entity.id")
    @Mapping(target = "name", source = "entity.name")
    @Mapping(target = "lastName", source = "entity.lastName")
    @Mapping(target = "email", source = "entity.email")
    CandidateDTO toDTO(Candidate entity);

    @Override
    @Mapping(target = "id", source = "dto.id")
    @Mapping(target = "name", source = "dto.name")
    @Mapping(target = "lastName", source = "dto.lastName")
    @Mapping(target = "email", source = "dto.email")
    Candidate toEntity(CandidateDTO dto);

    @Override
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "email", source = "email")
    Candidate updateExistingEntity(CandidateDTO candidateDTO, @MappingTarget Candidate candidate);
}
