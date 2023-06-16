package com.levio.javalab.interviewmanager.mapper;

import com.levio.javalab.interviewmanager.dto.InterviewRequestDTO;
import com.levio.javalab.interviewmanager.dto.JobPositionDTO;
import com.levio.javalab.interviewmanager.entity.InterviewRequest;
import com.levio.javalab.interviewmanager.entity.JobPosition;
import com.levio.javalab.interviewmanager.lang.mapper.EntityToDTOMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface InterviewRequestMapper extends EntityToDTOMapper<InterviewRequest, InterviewRequestDTO> {
    @Override
    @Mapping(target = "id", source = "entity.id")
    @Mapping(target = "description", source = "entity.description")
    @Mapping(target = "duration", source = "entity.duration")
    @Mapping(target = "status", source = "entity.status")
    @Mapping(target = "urgent", source = "entity.urgent")
    @Mapping(target = "lineBusinessId", source = "entity.jobPosition.lineBusiness.id")
    @Mapping(target = "lineBusinessName", source = "entity.jobPosition.lineBusiness.name")
    @Mapping(target = "jobPositionId", source = "entity.jobPosition.id")
    @Mapping(target = "jobPositionDescription", source = "entity.jobPosition.description")
    @Mapping(target = "jobPositionLevelExpertise", source = "entity.jobPosition.levelExpertise")
    @Mapping(target = "recruiterId", source = "entity.recruiter.id")
    @Mapping(target = "recruiterName", source = "entity.recruiter.name")
    @Mapping(target = "recruiterLastName", source = "entity.recruiter.lastName")
    @Mapping(target = "recruiterEmail", source = "entity.recruiter.email")
    InterviewRequestDTO toDTO(InterviewRequest entity);

    @Override
    @Mapping(source = "dto.id", target = "id")
    @Mapping(source = "dto.description", target = "description")
    @Mapping(source = "dto.duration", target = "duration")
    @Mapping(source = "dto.status", target = "status")
    @Mapping(source = "dto.urgent", target = "urgent")
    @Mapping(source = "dto.lineBusinessId", target = "jobPosition.lineBusiness.id")
    @Mapping(source = "dto.lineBusinessName", target = "jobPosition.lineBusiness.name")
    @Mapping(source = "dto.jobPositionId", target = "jobPosition.id")
    @Mapping(source = "dto.jobPositionDescription", target = "jobPosition.description")
    @Mapping(source = "dto.jobPositionLevelExpertise", target = "jobPosition.levelExpertise")
    @Mapping(source = "dto.recruiterId", target = "recruiter.id")
    @Mapping(source = "dto.recruiterName", target = "recruiter.name")
    @Mapping(source = "dto.recruiterLastName", target = "recruiter.lastName")
    @Mapping(source = "dto.recruiterEmail", target = "recruiter.email")
    InterviewRequest toEntity(InterviewRequestDTO dto);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "duration", target = "duration")
    @Mapping(source = "status", target = "status")
    @Mapping(source = "urgent", target = "urgent")
    @Mapping(source = "lineBusinessId", target = "jobPosition.lineBusiness.id")
    @Mapping(source = "jobPositionId", target = "jobPosition.id")
    @Mapping(source = "recruiterId", target = "recruiter.id")
    @Mapping(source = "recruiterEmail", target = "recruiter.email")
    InterviewRequest updateExistingEntity(InterviewRequestDTO dto, @MappingTarget InterviewRequest entity);
}
