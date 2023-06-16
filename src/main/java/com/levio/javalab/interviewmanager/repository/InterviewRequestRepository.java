package com.levio.javalab.interviewmanager.repository;

import com.levio.javalab.interviewmanager.entity.InterviewRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRequestRepository extends JpaRepository<InterviewRequest, Long> {
}
