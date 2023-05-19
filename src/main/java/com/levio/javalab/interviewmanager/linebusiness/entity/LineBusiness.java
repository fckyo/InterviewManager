package com.levio.javalab.interviewmanager.linebusiness;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class LineBusiness {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "line_business_id")
    private Long id;

    @Column(name = "name")
    private String name;
}
