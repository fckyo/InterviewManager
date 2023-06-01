package com.levio.javalab.interviewmanager.lang.service;

import java.util.List;
import java.util.function.Supplier;

public interface CrudService<ID, DTO> {
    DTO createNew(DTO dto);

    List<DTO> findAll();

    DTO findById(ID id, Supplier<DTO> defaultValue);

    DTO update(ID id, DTO dto);
}
