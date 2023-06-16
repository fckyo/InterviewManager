package com.levio.javalab.interviewmanager.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class JobPositionDTO {
    private Long id;

    private String description;

    private Long lineBusinessId;

    private String lineBusinessName;

    private Long superiorId;

    private String levelExpertise;
}
