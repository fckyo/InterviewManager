package com.levio.javalab.interviewmanager.config;

import com.levio.javalab.interviewmanager.audit.aop.SpringSecurityAuditorAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(setDates = false, auditorAwareRef = "auditorAware")
public class CustomAuditorConfiguration {
    @Bean
    public AuditorAware<String> auditorAware() {
        return new SpringSecurityAuditorAware();
    }
}
