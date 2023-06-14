package com.levio.javalab.interviewmanager.repository;

import com.levio.javalab.interviewmanager.entity.InterviewRequestCandidate;
import org.springframework.data.repository.CrudRepository;

public interface InterviewRequestCandidateRepository  extends CrudRepository<InterviewRequestCandidate, String> {
}
