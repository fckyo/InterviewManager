package com.levio.javalab.interviewmanager.candidate.entity;

import jakarta.persistence.*;

@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    public Candidate(){}
    public Candidate(Long id){
        this.id = id;
    }

    public Candidate(Long id, String name, String lastName, String email){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }
}
