package com.levio.javalab.interviewmanager.job.entity;

import com.levio.javalab.interviewmanager.audit.entity.AuditableEntity;
import com.levio.javalab.interviewmanager.linebusiness.entity.LineBusiness;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "job_position")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class JobPosition extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_position_id")
    private Long id;

    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "line_business_id")
    private LineBusiness lineBusiness;

    @Column(name = "job_position_superior")
    private Long superiorId;

    @Column(name = "level_expertise")
    private String levelExpertise;

}
