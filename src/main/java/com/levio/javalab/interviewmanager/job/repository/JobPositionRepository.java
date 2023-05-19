package com.levio.javalab.interviewmanager.job.repository;

import com.levio.javalab.interviewmanager.job.entity.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "job")
public interface JobPositionRepository extends JpaRepository<JobPosition, Long> {
}
