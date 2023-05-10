package com.levio.javalab.interviewmanager.recruiter.entity;

import jakarta.persistence.*;

@Entity
public class Recruiter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    public Recruiter(){}

    public Recruiter(Long id){
        this.id = id;
    }

    public Recruiter(Long id, String name, String lastName, String email){
        this.id = id;
        this.name = lastName;
        this.email = email;
    }

}
