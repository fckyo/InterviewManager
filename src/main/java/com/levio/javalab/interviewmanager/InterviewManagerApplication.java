package com.levio.javalab.interviewmanager;

import com.levio.javalab.interviewmanager.audit.aop.SpringSecurityAuditorAware;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class InterviewManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(InterviewManagerApplication.class, args);
    }

}
