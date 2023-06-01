package com.levio.javalab.interviewmanager.lang.service.impl;

import com.levio.javalab.interviewmanager.lang.mapper.EntityToDTOMapper;
import com.levio.javalab.interviewmanager.lang.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class DefaultCrudServiceImpl<R extends JpaRepository<Entity, ID>, M extends EntityToDTOMapper<Entity, DTO>,ID,DTO, Entity> implements CrudService<ID, DTO> {
    private R repository;
    private M mapper;

    protected DefaultCrudServiceImpl(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public DTO createNew(DTO dto) {
        return mapper.toDTO(repository.save(mapper.toEntity(dto)));
    }

    @Override
    public List<DTO> findAll() {
        return StreamSupport.stream(repository.findAll().spliterator(),false)
                .map(entity -> mapper.toDTO(entity))
                .collect(Collectors.toList());
    }

    @Override
    public DTO findById(ID id, Supplier<DTO> defaultValue) {
        return repository.findById(id)
                         .map(entity -> mapper.toDTO(entity))
                         .orElseGet(defaultValue);
    }

    @Override
    public DTO update(ID id, DTO dto) {
        return repository.findById(id)
                         .map(entity -> mapper.toDTO(repository.save(mapper.updateExistingEntity(dto, entity))))
                         .orElse(null);
    }

}
