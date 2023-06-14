package com.levio.javalab.interviewmanager.service.impl;

import com.levio.javalab.interviewmanager.lang.service.impl.DefaultCrudServiceImpl;
import com.levio.javalab.interviewmanager.dto.RecruiterDTO;
import com.levio.javalab.interviewmanager.entity.Recruiter;
import com.levio.javalab.interviewmanager.mapper.RecruiterMapper;
import com.levio.javalab.interviewmanager.repository.RecruiterRepository;
import com.levio.javalab.interviewmanager.service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultRecruiterService extends DefaultCrudServiceImpl<RecruiterRepository, RecruiterMapper, Long, RecruiterDTO, Recruiter> implements RecruiterService {

    @Autowired
    public DefaultRecruiterService(RecruiterRepository repository, RecruiterMapper mapper){
        super(repository, mapper);
    }
}
