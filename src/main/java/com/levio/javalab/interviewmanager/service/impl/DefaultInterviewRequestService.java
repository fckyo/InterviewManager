package com.levio.javalab.interviewmanager.service.impl;

import com.levio.javalab.interviewmanager.dto.InterviewRequestDTO;
import com.levio.javalab.interviewmanager.entity.InterviewRequest;
import com.levio.javalab.interviewmanager.lang.service.impl.DefaultCrudServiceImpl;
import com.levio.javalab.interviewmanager.mapper.InterviewRequestMapper;
import com.levio.javalab.interviewmanager.repository.InterviewRequestRepository;
import com.levio.javalab.interviewmanager.service.InterviewRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class DefaultInterviewRequestService extends DefaultCrudServiceImpl<InterviewRequestRepository, InterviewRequestMapper, Long, InterviewRequestDTO, InterviewRequest> implements InterviewRequestService {

    @Autowired
    public DefaultInterviewRequestService(InterviewRequestRepository repository, InterviewRequestMapper mapper){
        super(repository, mapper);
    }
}
