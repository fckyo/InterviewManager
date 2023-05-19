package com.levio.javalab.interviewmanager.techadvisor.repository;

import com.levio.javalab.interviewmanager.techadvisor.entity.TechnicalAdvisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "technicalAdvisor")
public interface TechnicalAdvisorRepository extends JpaRepository<TechnicalAdvisor, Long> {
}
