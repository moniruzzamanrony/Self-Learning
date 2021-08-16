package com.spring.hibernatejpa.controller;

import com.spring.hibernatejpa.dto.PrivateTeacherDto;
import com.spring.hibernatejpa.services.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String getPrivateTeachersById()
    {
        return "hay";
    }
}
