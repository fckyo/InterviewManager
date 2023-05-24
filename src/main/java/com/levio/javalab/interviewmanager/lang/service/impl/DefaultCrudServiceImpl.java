package com.levio.javalab.interviewmanager.lang.service.impl;

import com.levio.javalab.interviewmanager.lang.mapper.EntityToDTOMapper;
import com.levio.javalab.interviewmanager.lang.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class DefaultCrudServiceImpl<R extends JpaRepository, M extends EntityToDTOMapper,ID,DTO> implements CrudService<ID, DTO> {
    protected R repository;
    protected M mapper;

    @Override
    public DTO createNew(DTO dto) {
        return (DTO) mapper.toDTO(repository.save(mapper.toEntity(dto)));
    }

    @Override
    public List<DTO> findAll() {
        return (List<DTO>) StreamSupport.stream(repository.findAll().spliterator(),false)
                .map(entity -> mapper.toDTO(entity))
                .collect(Collectors.toList());
    }

    @Override
    public DTO findById(ID id, Supplier defaultValue) {
        return (DTO) (repository.findById(id)
                                .flatMap(entity -> Optional.of(mapper.toDTO(entity)))
                                .or(defaultValue).get());
    }

    @Override
    public DTO update(ID id, DTO dto) {
        Optional result = repository.findById(id);
        if(result.isPresent())
            return (DTO) mapper.toDTO(repository.save(mapper.updateExistingEntity(dto, result.get())));
        return null;
    }

}
