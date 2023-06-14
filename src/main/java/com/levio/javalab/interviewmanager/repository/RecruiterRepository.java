package com.levio.javalab.interviewmanager.repository;

import com.levio.javalab.interviewmanager.entity.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter, Long> {
}
