package com.spring.hibernatejpa.dto;

import com.spring.hibernatejpa.domain.model.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Data
public class PrivateTeacherDto {
    private String name;

    private String phone;
}
