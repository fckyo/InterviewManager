package com.levio.javalab.interviewmanager.entity;

import com.levio.javalab.interviewmanager.audit.entity.AuditableEntity;
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
public class InterviewRequestCandidate extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interview_request_candidate_id")
    private Long id;

    @Column(name="status")
    private String status;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    @ManyToOne
    private Candidate candidate;

    @ManyToOne
    private InterviewRequest interviewRequest;

    @Column(name = "uuid")
    private String uuid;

    public InterviewRequestCandidate(Long id){
        this.id = id;
    }
}
