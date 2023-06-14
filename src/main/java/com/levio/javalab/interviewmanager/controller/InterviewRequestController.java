package com.levio.javalab.interviewmanager.controller;

import com.levio.javalab.interviewmanager.entity.InterviewRequest;
import com.levio.javalab.interviewmanager.service.InterviewRequestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/interview")
public class InterviewRequestController {
    private final InterviewRequestService service;
    public InterviewRequestController(InterviewRequestService service){
        this.service = service;
    }

    @GetMapping
    public List<InterviewRequest> getInterviews(){
        return service.getInterviews();
    }
}
