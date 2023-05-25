package com.levio.javalab.interviewmanager.candidate.controller;

import com.levio.javalab.interviewmanager.candidate.dto.CandidateDTO;
import com.levio.javalab.interviewmanager.candidate.service.CandidateService;
import com.levio.javalab.interviewmanager.techadvisor.dto.TechnicalAdvisorDTO;
import com.levio.javalab.interviewmanager.techadvisor.service.TechnicalAdvisorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {
    private final CandidateService service;

    public CandidateController(CandidateService service){
        this.service = service;
    }

    @GetMapping
    public List<CandidateDTO> getAllCandidates(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public CandidateDTO getCandidate(@PathVariable Long id){
        return service.findById(id, () -> Optional.of(new CandidateDTO())
        );
    }

    @PostMapping
    public CandidateDTO saveCandidate(@RequestBody CandidateDTO candidateDTO){
        return service.createNew(candidateDTO);
    }

    @RequestMapping(value="/{id}", method={RequestMethod.POST,RequestMethod.PUT})
    public CandidateDTO updateCandidate(@PathVariable Long id, @RequestBody CandidateDTO candidateDTO){
        return service.update(id,candidateDTO);
    }
}
