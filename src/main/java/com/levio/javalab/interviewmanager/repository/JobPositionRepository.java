package com.levio.javalab.interviewmanager.repository;

import com.levio.javalab.interviewmanager.entity.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "job")
public interface JobPositionRepository extends JpaRepository<JobPosition, Long> {
}
