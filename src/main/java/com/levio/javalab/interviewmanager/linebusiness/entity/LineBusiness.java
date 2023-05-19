package com.levio.javalab.interviewmanager.linebusiness.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "line_business")
public class LineBusiness {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "line_business_id")
    private Long id;

    @Column(name = "name")
    private String name;
}
