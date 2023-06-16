package com.levio.javalab.interviewmanager.repository;

import com.levio.javalab.interviewmanager.entity.InterviewRequestCandidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRequestCandidateRepository  extends CrudRepository<InterviewRequestCandidate, String> {
}
