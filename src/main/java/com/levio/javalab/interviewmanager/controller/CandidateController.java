package com.levio.javalab.interviewmanager.controller;

import com.levio.javalab.interviewmanager.dto.CandidateDTO;
import com.levio.javalab.interviewmanager.service.CandidateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        return service.findById(id, CandidateDTO::new);
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
