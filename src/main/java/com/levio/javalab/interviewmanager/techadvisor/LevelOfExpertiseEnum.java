package com.levio.javalab.interviewmanager.techadvisor;

import lombok.Getter;

@Getter
public enum LevelOfExpertiseEnum {
    JUNIOR("A"), INTERMEDIATE("B"), SENIOR("C"), SENIOR_PLUS("D"), EMERITUS("E");
    private final String value;

    LevelOfExpertiseEnum(String value) {
        this.value = value;
    }
}
