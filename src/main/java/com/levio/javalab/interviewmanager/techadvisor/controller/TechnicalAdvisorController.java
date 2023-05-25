package com.levio.javalab.interviewmanager.techadvisor.controller;

import com.levio.javalab.interviewmanager.techadvisor.dto.TechnicalAdvisorDTO;
import com.levio.javalab.interviewmanager.techadvisor.service.TechnicalAdvisorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/technicalAdvisor")
public class TechnicalAdvisorController {

    private final TechnicalAdvisorService service;

    public TechnicalAdvisorController(TechnicalAdvisorService service){
        this.service = service;
    }

    @GetMapping
    public List<TechnicalAdvisorDTO> getAllTechnicalAdvisors(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public TechnicalAdvisorDTO getTechnicalAdvisor(@PathVariable Long id){
        return service.findById(id, () -> Optional.of(new TechnicalAdvisorDTO())
                );
    }

    @PostMapping
    public TechnicalAdvisorDTO saveTechnicalAdvisor(@RequestBody TechnicalAdvisorDTO technicalAdvisorDTO){
        return service.createNew(technicalAdvisorDTO);
    }

    @RequestMapping(value="/{id}", method={RequestMethod.POST,RequestMethod.PUT})
    public TechnicalAdvisorDTO updateTechnicalAdvisor(@PathVariable Long id, @RequestBody TechnicalAdvisorDTO technicalAdvisorDTO){
        return service.update(id,technicalAdvisorDTO);
    }
}
