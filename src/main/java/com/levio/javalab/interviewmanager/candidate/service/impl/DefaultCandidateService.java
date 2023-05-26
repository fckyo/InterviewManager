package com.levio.javalab.interviewmanager.candidate.service.impl;

import com.levio.javalab.interviewmanager.candidate.dto.CandidateDTO;
import com.levio.javalab.interviewmanager.candidate.entity.Candidate;
import com.levio.javalab.interviewmanager.candidate.mapper.CandidateMapper;
import com.levio.javalab.interviewmanager.candidate.repository.CandidateRepository;
import com.levio.javalab.interviewmanager.candidate.service.CandidateService;
import com.levio.javalab.interviewmanager.lang.service.impl.DefaultCrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultCandidateService extends DefaultCrudServiceImpl<Candidate, CandidateRepository, CandidateMapper, Long, CandidateDTO> implements CandidateService {
    @Autowired
    public DefaultCandidateService(CandidateRepository repository, CandidateMapper mapper){
       super(repository, mapper);
    }
}
