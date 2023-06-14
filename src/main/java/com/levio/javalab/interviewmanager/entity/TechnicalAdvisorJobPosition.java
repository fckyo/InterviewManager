package com.levio.javalab.interviewmanager.entity;

import com.levio.javalab.interviewmanager.audit.entity.AuditableEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "job_position_tech_advisor")
public class TechnicalAdvisorJobPosition extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "job_position_tech_advisor_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "technical_advisor_id")
    private TechnicalAdvisor technicalAdvisor;

    @ManyToOne
    @JoinColumn(name = "job_position_id")
    private JobPosition jobPosition;
}
