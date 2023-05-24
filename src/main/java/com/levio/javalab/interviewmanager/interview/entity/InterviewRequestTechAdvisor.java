package com.levio.javalab.interviewmanager.interview.entity;

import com.levio.javalab.interviewmanager.audit.entity.AuditableEntity;
import com.levio.javalab.interviewmanager.techadvisor.entity.TechnicalAdvisor;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class InterviewRequestTechAdvisor extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "interview_request_tech_advisor_id")
    private String id;

    @Column(name="status")
    private String status;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    @ManyToOne
    private TechnicalAdvisor technicalAdvisor;

    @ManyToOne
    private InterviewRequest interviewRequest;

    @Column(name = "uuid")
    private String uuid;

    public InterviewRequestTechAdvisor(String id){
        this.id = id;
    }
}
