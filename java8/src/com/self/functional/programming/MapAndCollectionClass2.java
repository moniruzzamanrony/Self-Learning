package com.self.functional.programming;

import com.self.functional.programming.dto.Employee;
import com.self.functional.programming.dto.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndCollectionClass2 {
    public static void main(String[] args) {
        List<String> nameList = List.of("Roni", "Moni");

        //Regular
        System.out.println("-------------- Regular -----------------");
        List<Student> studentListRegular = new ArrayList<>();
        for (String name : nameList) {
            studentListRegular.add(new Student(name));
        }
        System.out.println(studentListRegular);

        System.out.println("-------------- Lambda function 1-----------------");
        List<Student> studentList = nameList.stream().filter(res-> res.toLowerCase().equals("roni")).map(Student::new).collect(Collectors.toList());
        System.out.println(studentList);

        System.out.println("-------------- Lambda function 1-----------------");
        List<Employee> employeeList = nameList.stream().map(res->{
                    return new Employee(1,res,100.00);
                }).collect(Collectors.toList());
        System.out.println(employeeList);

        // --------- Sum
       double sum = employeeList.stream().mapToDouble(Employee:: getSalary)
                .sum();
       System.out.println(sum);
    }
}

