package com.levio.javalab.interviewmanager.controller;

import com.levio.javalab.interviewmanager.dto.LineBusinessDTO;
import com.levio.javalab.interviewmanager.service.LineBusinessService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lineBusiness")
public class LineBusinessController {
    private final LineBusinessService service;

    public LineBusinessController(LineBusinessService service){
        this.service = service;
    }

    @GetMapping
    public List<LineBusinessDTO> getAllLineBusiness(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public LineBusinessDTO getLineBusiness(@PathVariable Long id){
        return service.findById(id, LineBusinessDTO::new);
    }

    @PostMapping
    public LineBusinessDTO saveLineBusiness(@RequestBody LineBusinessDTO lineBusinessDTO){
        return service.createNew(lineBusinessDTO);
    }

    @RequestMapping(value="/{id}", method={RequestMethod.POST,RequestMethod.PUT})
    public LineBusinessDTO updateLineBusiness(@PathVariable Long id, @RequestBody LineBusinessDTO lineBusinessDTO){
        return service.update(id,lineBusinessDTO);
    }
}
