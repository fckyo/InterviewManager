package com.levio.javalab.interviewmanager.recruiter.repository;

import com.levio.javalab.interviewmanager.recruiter.entity.Recruiter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruiterRepository extends CrudRepository<Recruiter, Long> {
}
