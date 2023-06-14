package com.levio.javalab.interviewmanager.repository;

import com.levio.javalab.interviewmanager.entity.TechnicalAdvisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicalAdvisorRepository extends JpaRepository<TechnicalAdvisor, Long> {
}
