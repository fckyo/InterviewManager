package com.levio.javalab.interviewmanager.repository;

import com.levio.javalab.interviewmanager.entity.LineBusiness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineBusinessRepository extends JpaRepository<LineBusiness, Long> {
}
