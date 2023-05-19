package com.levio.javalab.interviewmanager.interview.repository;

import com.levio.javalab.interviewmanager.interview.entity.InterviewRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRequestRepository extends CrudRepository<InterviewRequest, Long> {
}
