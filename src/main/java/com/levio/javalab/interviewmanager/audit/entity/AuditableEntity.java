package com.levio.javalab.interviewmanager.audit.entity;

import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public class AuditableEntity {
    protected Date createDate;
    protected Date modifyDate;
    protected String createdBy;
    protected String modifiedBy;
}
