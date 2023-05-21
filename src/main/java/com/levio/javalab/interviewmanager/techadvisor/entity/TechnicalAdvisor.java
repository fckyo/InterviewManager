package com.levio.javalab.interviewmanager.techadvisor.entity;

import com.levio.javalab.interviewmanager.audit.entity.AuditableEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.AuditOverride;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.NonNull;

import java.util.Set;

@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@AuditOverride(forClass = AuditableEntity.class)
@Table(name = "technical_advisor")
public class TechnicalAdvisor extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "technical_advisor_id")
    private Long id;

    @Column(name = "name")
    @NonNull
    private String name;

    @Column(name = "last_name")
    @NonNull
    private String lastName;

    @Column(name = "email")
    @NonNull
    private String email;

    @Column(name = "is_active")
    private Boolean active;

    @OneToMany(mappedBy = "technicalAdvisor", cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE })
    private Set<TechnicalAdvisorJobPosition> jobPositions;

}
