package com.spring.hibernatejpa.domain.repo;

import com.spring.hibernatejpa.domain.model.PrivateTeacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PrivateTeacherRepo extends JpaRepository<PrivateTeacher, Long> {

    @Query(value = "SELECT pt from PrivateTeacher pt where pt.name like %?1%", nativeQuery = false)
    Page<PrivateTeacher> findAllByNameUsingJPQL(String name, PageRequest pageRequest);


    @Query(value = "SELECT * from private_techers where name like %?1%", nativeQuery = true)
    Page<PrivateTeacher> findAllByNameUsingNativeQuery(String name, PageRequest pageRequestNative);
}
