package com.levio.javalab.interviewmanager.job.entity;

import com.levio.javalab.interviewmanager.audit.entity.AuditableEntity;
import com.levio.javalab.interviewmanager.linebusiness.LineBusiness;
import jakarta.persistence.*;

@Entity
public class JobPosition extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="description")
    private String description;
    @ManyToOne
    private LineBusiness lineBusiness;
    @ManyToOne
    private JobPosition superior;

    public JobPosition(){};

    public JobPosition(Long id){
        this.id = id;
    }

    public JobPosition(Long id, String description, LineBusiness lineBusiness, JobPosition superior){
        this.id = id;
        this.description = description;
        this.lineBusiness = lineBusiness;
        this.superior = superior;
    }
}
