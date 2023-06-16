package com.levio.javalab.interviewmanager.dto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class InterviewRequestDTO {
    private Long id;
    private Long jobPositionId;
    private String jobPositionDescription;
    private String jobPositionLevelExpertise;
    private Long lineBusinessId;
    private String lineBusinessName;
    private Long recruiterId;
    private String recruiterName;
    private String recruiterLastName;
    private String recruiterEmail;
    private Boolean urgent;
    private Long duration;
    private String status;
    private String description;
}
