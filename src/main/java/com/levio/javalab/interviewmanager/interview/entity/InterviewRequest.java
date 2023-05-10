package com.levio.javalab.interviewmanager.interview.entity;

import com.levio.javalab.interviewmanager.audit.entity.AuditableEntity;
import com.levio.javalab.interviewmanager.job.entity.JobPosition;
import com.levio.javalab.interviewmanager.recruiter.entity.Recruiter;
import jakarta.persistence.*;

@Entity
public class InterviewRequest extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private JobPosition jobPosition;

    @ManyToOne
    private Recruiter recruiter;

    @Column(name = "urgent")
    private Boolean urgent;

    @Column(name = "duration")
    private Long duration;

    @Column(name = "status")
    private String status;

    @Column(name = "description")
    private String description;

    public InterviewRequest() {}

    public InterviewRequest(Long id){
        this.id = id;
    }

    public InterviewRequest(Long id, JobPosition jobPosition, Recruiter recruiter, Boolean urgent, Long duration, String status, String description){
        this.id = id;
        this.jobPosition = jobPosition;
        this.recruiter = recruiter;
        this.urgent = urgent;
        this.duration = duration;
        this.status = status;
        this.description = description;
    }

}
