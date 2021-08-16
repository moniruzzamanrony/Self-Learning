package com.spring.hibernatejpa.controller;

import com.spring.hibernatejpa.domain.model.PrivateTeacher;
import com.spring.hibernatejpa.dto.PrivateTeacherDto;
import com.spring.hibernatejpa.services.PrivateTeacherService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("private-teachers")
public class PrivateTeacherController {
    private final PrivateTeacherService service;

    @PostMapping()
    public ResponseEntity<PrivateTeacher> save(@RequestBody PrivateTeacherDto privateTeacherDto) {
        return service.save(privateTeacherDto);
    }

    @GetMapping()
    public ResponseEntity<PrivateTeacher> getPrivateTeachers(@RequestParam Optional<Integer> page, @RequestParam Optional<String> name) {
        return service.getPrivateTeachers(PageRequest.of(page.orElse(0), 5, Sort.by("id").ascending())
                , name.orElse(""));
    }

    /**
     * @return
     */
    @GetMapping("/{id}")
    public String getPrivateTeachersById()
    {
        return "hello";
    }
}
