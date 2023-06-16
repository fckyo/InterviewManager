package com.levio.javalab.interviewmanager.repository;

import com.levio.javalab.interviewmanager.entity.InterviewRequestTechAdvisor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRequestTechAdvisorRepository extends CrudRepository<InterviewRequestTechAdvisor, String> {
}
