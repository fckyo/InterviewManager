package com.levio.javalab.interviewmanager.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "line_business")
public class LineBusiness {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "line_business_id")
    private Long id;

    @Column(name = "name")
    private String name;
}
