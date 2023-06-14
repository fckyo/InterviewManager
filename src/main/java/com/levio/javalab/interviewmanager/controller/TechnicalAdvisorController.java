package com.levio.javalab.interviewmanager.controller;

import com.levio.javalab.interviewmanager.dto.TechnicalAdvisorDTO;
import com.levio.javalab.interviewmanager.service.TechnicalAdvisorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        return service.findById(id, TechnicalAdvisorDTO::new);
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
