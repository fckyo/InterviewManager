package com.levio.javalab.interviewmanager.job.entity;

import com.levio.javalab.interviewmanager.audit.entity.AuditableEntity;
import com.levio.javalab.interviewmanager.expertise.entity.LevelExpertise;
import com.levio.javalab.interviewmanager.techadvisor.entity.TechnicalAdvisor;
import jakarta.persistence.*;

public class JobPositionTechnicalAdvisor extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private LevelExpertise levelExpertise;

    @ManyToOne(fetch = FetchType.LAZY)
    private TechnicalAdvisor technicalAdvisor;

    @ManyToOne
    private JobPosition jobPosition;

    public JobPositionTechnicalAdvisor(){}

    public JobPositionTechnicalAdvisor(Long id){
        this.id = id;
    }

    public JobPositionTechnicalAdvisor(Long id, LevelExpertise levelExpertise, TechnicalAdvisor technicalAdvisor, JobPosition jobPosition){
        this.id = id;
        this.levelExpertise = levelExpertise;
        this.technicalAdvisor = technicalAdvisor;
        this.jobPosition = jobPosition;
    }
}
