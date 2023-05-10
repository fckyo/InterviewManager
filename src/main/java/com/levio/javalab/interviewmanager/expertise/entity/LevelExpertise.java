package com.levio.javalab.interviewmanager.expertise.entity;

import jakarta.persistence.*;

@Entity
public class LevelExpertise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "value")
    private String value;

    public LevelExpertise(){}

    public LevelExpertise(Long id){
        this.id = id;
    }

    public LevelExpertise(Long id, String description, String value){
        this.id = id;
        this.description = description;
        this.value = value;
    }
}
