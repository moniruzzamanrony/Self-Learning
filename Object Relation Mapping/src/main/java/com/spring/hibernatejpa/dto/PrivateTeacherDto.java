package com.spring.hibernatejpa.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PrivateTeacherDto {

    private String name;
    private String phone;
}
