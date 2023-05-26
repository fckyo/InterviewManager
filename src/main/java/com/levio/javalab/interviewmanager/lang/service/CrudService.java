package com.levio.javalab.interviewmanager.lang.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public interface CrudService<ID, DTO> {
    DTO createNew(DTO dto);

    List<DTO> findAll();

    //Todo : pourquoi un findById avec un Supplier ?
    //En plus tu utilisais un Supplier d'Optional et non un Supplier de DTO
    DTO findById(ID id, Supplier<DTO> defaultValue);

    DTO update(ID id, DTO dto);
}
