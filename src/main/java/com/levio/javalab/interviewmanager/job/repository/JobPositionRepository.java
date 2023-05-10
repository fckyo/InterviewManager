package com.levio.javalab.interviewmanager.job.repository;

import com.levio.javalab.interviewmanager.job.entity.JobPosition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPositionRepository extends CrudRepository<JobPosition, Long> {
}
