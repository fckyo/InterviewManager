package com.levio.javalab.interviewmanager.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class TechnicalAdvisorDTO {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Boolean active;
    private Long jobPositionId;
    private String jobPositionDescription;
    private String lineBusinessDescription;
    private Long lineBusinessId;
}
