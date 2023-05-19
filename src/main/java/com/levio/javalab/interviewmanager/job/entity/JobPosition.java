package com.levio.javalab.interviewmanager.job.entity;

import com.levio.javalab.interviewmanager.audit.entity.AuditableEntity;
import com.levio.javalab.interviewmanager.linebusiness.entity.LineBusiness;
import com.levio.javalab.interviewmanager.techadvisor.entity.TechnicalAdvisorJobPosition;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.NonNull;

import java.util.Set;

@Entity
@Table(name = "job_position")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode
@Audited
@AuditOverride(forClass = AuditableEntity.class)
public class JobPosition extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_position_id")
    private Long id;

    @Column(name="description")
    @NonNull
    private String description;

    @ManyToOne
    @NonNull
    @JoinColumn(name = "line_business_id")
    private LineBusiness lineBusiness;

    @Column(name = "job_position_superior")
    private Long superiorId;

    @OneToMany(mappedBy = "jobPosition")
    private Set<TechnicalAdvisorJobPosition> technicalAdvisors;

}
