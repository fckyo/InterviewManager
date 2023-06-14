package com.levio.javalab.interviewmanager.service.impl;

import com.levio.javalab.interviewmanager.entity.InterviewRequest;
import com.levio.javalab.interviewmanager.repository.InterviewRequestRepository;
import com.levio.javalab.interviewmanager.service.InterviewRequestService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class InterviewRequestServiceImpl implements InterviewRequestService {
    private final InterviewRequestRepository repository;


    public InterviewRequestServiceImpl(InterviewRequestRepository repository){
        this.repository = repository;
    }
    @Override
    public List<InterviewRequest> getInterviews() {
        return StreamSupport.stream(repository.findAll().spliterator(), false).toList();
    }
}
