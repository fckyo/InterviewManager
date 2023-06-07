package com.levio.javalab.interviewmanager.recruiter.service.impl;

import com.levio.javalab.interviewmanager.lang.service.impl.DefaultCrudServiceImpl;
import com.levio.javalab.interviewmanager.recruiter.dto.RecruiterDTO;
import com.levio.javalab.interviewmanager.recruiter.entity.Recruiter;
import com.levio.javalab.interviewmanager.recruiter.mapper.RecruiterMapper;
import com.levio.javalab.interviewmanager.recruiter.repository.RecruiterRepository;
import com.levio.javalab.interviewmanager.recruiter.service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultRecruiterService extends DefaultCrudServiceImpl<RecruiterRepository, RecruiterMapper, Long, RecruiterDTO, Recruiter> implements RecruiterService {

    @Autowired
    public DefaultRecruiterService(RecruiterRepository repository, RecruiterMapper mapper){
        super(repository, mapper);
    }
}
