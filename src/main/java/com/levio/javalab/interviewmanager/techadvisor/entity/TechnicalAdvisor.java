package com.levio.javalab.interviewmanager.techadvisor.entity;

import com.levio.javalab.interviewmanager.audit.entity.AuditableEntity;
import jakarta.persistence.*;

@Entity
public class TechnicalAdvisor extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "is_active")
    private Boolean active;

    public TechnicalAdvisor(){}

    public TechnicalAdvisor(Long id){}

    public TechnicalAdvisor(Long id, String name, String lastName, String email, Boolean active){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.active = active;
    }
}
