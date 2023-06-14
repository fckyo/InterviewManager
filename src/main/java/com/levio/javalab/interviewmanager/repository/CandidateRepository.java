package com.levio.javalab.interviewmanager.repository;

import com.levio.javalab.interviewmanager.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
