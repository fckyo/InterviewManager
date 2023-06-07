package com.levio.javalab.interviewmanager.interview.repository;

import com.levio.javalab.interviewmanager.interview.entity.InterviewRequestCandidate;
import org.springframework.data.repository.CrudRepository;

public interface InterviewRequestCandidateRepository  extends CrudRepository<InterviewRequestCandidate, String> {
}
