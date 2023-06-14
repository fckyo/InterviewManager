package com.levio.javalab.interviewmanager.entity;

import com.levio.javalab.interviewmanager.audit.entity.AuditableEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class InterviewRequest extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interview_request_id")
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

    public InterviewRequest(Long id){
        this.id = id;
    }

}
