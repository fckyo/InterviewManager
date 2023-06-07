package com.levio.javalab.interviewmanager.techadvisor.service.impl;

import com.levio.javalab.interviewmanager.lang.service.impl.DefaultCrudServiceImpl;
import com.levio.javalab.interviewmanager.techadvisor.dto.TechnicalAdvisorDTO;
import com.levio.javalab.interviewmanager.techadvisor.entity.TechnicalAdvisor;
import com.levio.javalab.interviewmanager.techadvisor.mapper.TechnicalAdvisorMapper;
import com.levio.javalab.interviewmanager.techadvisor.repository.TechnicalAdvisorRepository;
import com.levio.javalab.interviewmanager.techadvisor.service.TechnicalAdvisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultTechnicalAdvisorService extends DefaultCrudServiceImpl<TechnicalAdvisorRepository, TechnicalAdvisorMapper, Long, TechnicalAdvisorDTO, TechnicalAdvisor> implements TechnicalAdvisorService {

    @Autowired
    public DefaultTechnicalAdvisorService(TechnicalAdvisorRepository repository, TechnicalAdvisorMapper mapper){
        super(repository, mapper);
    }


}
