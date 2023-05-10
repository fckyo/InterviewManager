package com.levio.javalab.interviewmanager.candidate.repository;

import com.levio.javalab.interviewmanager.candidate.entity.Candidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, Long> {
}
