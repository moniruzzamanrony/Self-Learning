package com.spring.hibernatejpa.domain.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

import static javax.persistence.TemporalType.TIME;
import static javax.persistence.TemporalType.TIMESTAMP;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @CreatedBy
    private String createdBy;

    @CreatedDate
    @Temporal(TIME)
    private Date creatorDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    @Temporal(TIMESTAMP)
    private Date lastModifiedDate;

}
