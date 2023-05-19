package com.levio.javalab.interviewmanager.candidate.repository;

import com.levio.javalab.interviewmanager.candidate.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "candidate")
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
