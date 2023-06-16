package com.levio.javalab.interviewmanager.service.impl;

import com.levio.javalab.interviewmanager.dto.JobPositionDTO;
import com.levio.javalab.interviewmanager.entity.JobPosition;
import com.levio.javalab.interviewmanager.lang.service.impl.DefaultCrudServiceImpl;
import com.levio.javalab.interviewmanager.mapper.JobPositionMapper;
import com.levio.javalab.interviewmanager.repository.JobPositionRepository;
import com.levio.javalab.interviewmanager.service.JobPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultJobPositionService extends DefaultCrudServiceImpl<JobPositionRepository, JobPositionMapper, Long, JobPositionDTO, JobPosition> implements JobPositionService {
    @Autowired
    public DefaultJobPositionService(JobPositionRepository repository, JobPositionMapper mapper){
        super(repository, mapper);
    }
}
