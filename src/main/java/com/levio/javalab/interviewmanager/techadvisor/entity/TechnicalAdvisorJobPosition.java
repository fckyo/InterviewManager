package com.levio.javalab.interviewmanager.techadvisor.entity;

import com.levio.javalab.interviewmanager.audit.entity.AuditableEntity;
import com.levio.javalab.interviewmanager.job.entity.JobPosition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "job_position_tech_advisor")
public class TechnicalAdvisorJobPosition extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "job_position_tech_advisor_id")
    private Long id;

    @Column(name = "level_expertise")
    private String levelExpertise;

    @ManyToOne
    @JoinColumn(name = "technical_advisor_id")
    private TechnicalAdvisor technicalAdvisor;

    @ManyToOne
    @JoinColumn(name = "job_position_id")
    private JobPosition jobPosition;
}
