package com.levio.javalab.interviewmanager.recruiter.controller;

import com.levio.javalab.interviewmanager.candidate.dto.CandidateDTO;
import com.levio.javalab.interviewmanager.candidate.service.CandidateService;
import com.levio.javalab.interviewmanager.recruiter.dto.RecruiterDTO;
import com.levio.javalab.interviewmanager.recruiter.service.RecruiterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/recruiter")
public class RecruiterController {

    private final RecruiterService service;

    public RecruiterController(RecruiterService service){
        this.service = service;
    }

    @GetMapping
    public List<RecruiterDTO> getAllRecruiters(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public RecruiterDTO getCandidate(@PathVariable Long id){
        return service.findById(id, () -> Optional.of(new RecruiterDTO())
        );
    }

    @PostMapping
    public RecruiterDTO saveCandidate(@RequestBody RecruiterDTO recruiterDTO){
        return service.createNew(recruiterDTO);
    }

    @RequestMapping(value="/{id}", method={RequestMethod.POST,RequestMethod.PUT})
    public RecruiterDTO updateCandidate(@PathVariable Long id, @RequestBody RecruiterDTO recruiterDTO){
        return service.update(id,recruiterDTO);
    }
}
