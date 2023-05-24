package com.levio.javalab.interviewmanager.lang.mapper;

public interface EntityToDTOMapper<Entity, DTO> {
    DTO toDTO(Entity entity);
    Entity toEntity(DTO dto);

    Entity updateExistingEntity(DTO dto, Entity entity);
}
