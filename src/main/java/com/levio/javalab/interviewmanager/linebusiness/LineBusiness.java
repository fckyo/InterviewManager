package com.levio.javalab.interviewmanager.linebusiness;

import jakarta.persistence.*;

@Entity
public class LineBusiness {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;
}
