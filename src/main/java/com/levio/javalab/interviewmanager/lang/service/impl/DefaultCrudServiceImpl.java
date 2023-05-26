package com.levio.javalab.interviewmanager.lang.service.impl;

import com.levio.javalab.interviewmanager.lang.mapper.EntityToDTOMapper;
import com.levio.javalab.interviewmanager.lang.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

//Tu mets en place des generics dans certaines de tes classes, il faut les utiliser correctement pour éviter d'avoir des types manquants
public class DefaultCrudServiceImpl<E, R extends JpaRepository<E,ID>, M extends EntityToDTOMapper<E, DTO>,ID,DTO> implements CrudService<ID, DTO> {
    protected R repository;
    protected M mapper;

    //ToDo : Ajout du constructeur avec parametres
    public DefaultCrudServiceImpl(R repository, M mapper) {
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
        Optional<E> result = repository.findById(id);
        return result.map(e -> mapper.toDTO(repository.save(mapper.updateExistingEntity(dto, e)))).orElse(null);
    }

}
