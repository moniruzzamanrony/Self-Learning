package com.spring.hibernatejpa.services;

import com.spring.hibernatejpa.domain.model.PrivateTeacher;
import com.spring.hibernatejpa.domain.repo.PrivateTeacherRepo;
import com.spring.hibernatejpa.dto.PrivateTeacherDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
@AllArgsConstructor
public class PrivateTeacherService {
    private final PrivateTeacherRepo privateTeacherRepo;

    public ResponseEntity<PrivateTeacher> save(PrivateTeacherDto privateTeacherDto) {
        try {
            PrivateTeacher privateTeacher = new PrivateTeacher();
            BeanUtils.copyProperties(privateTeacherDto, privateTeacher);
            privateTeacherRepo.save(privateTeacher);
            return new ResponseEntity(privateTeacher, HttpStatus.CREATED);
        } catch (DataAccessException ignored) {
            throw new RuntimeException(ignored);
        }

    }

    public ResponseEntity<PrivateTeacher> getPrivateTeachers(PageRequest pageRequest, String name) {
        try{
            return new ResponseEntity(privateTeacherRepo.findAllByNameUsingJPQL(name,pageRequest),HttpStatus.OK);
        }catch (DataAccessException ignored) {
            throw new RuntimeException(ignored);
        }
    }
}
