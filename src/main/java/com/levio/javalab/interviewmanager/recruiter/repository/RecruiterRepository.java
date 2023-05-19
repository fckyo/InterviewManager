package com.levio.javalab.interviewmanager.recruiter.repository;

import com.levio.javalab.interviewmanager.recruiter.entity.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "recruiter")
public interface RecruiterRepository extends JpaRepository<Recruiter, Long> {
}
