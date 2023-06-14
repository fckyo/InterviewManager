package com.levio.javalab.interviewmanager.service.impl;

import com.levio.javalab.interviewmanager.dto.CandidateDTO;
import com.levio.javalab.interviewmanager.entity.Candidate;
import com.levio.javalab.interviewmanager.mapper.CandidateMapper;
import com.levio.javalab.interviewmanager.repository.CandidateRepository;
import com.levio.javalab.interviewmanager.service.CandidateService;
import com.levio.javalab.interviewmanager.lang.service.impl.DefaultCrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultCandidateService extends DefaultCrudServiceImpl<CandidateRepository, CandidateMapper, Long, CandidateDTO, Candidate> implements CandidateService {
    @Autowired
    public DefaultCandidateService(CandidateRepository repository, CandidateMapper mapper){
        super(repository, mapper);
    }
}
