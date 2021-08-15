package com.spring.hibernatejpa.domain.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "private_techers")
public class PrivateTeacher  extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    private String phone;
}
