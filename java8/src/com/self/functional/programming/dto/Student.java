package com.self.functional.programming.dto;

public class Student {
    private String name;
    private int role = 50;

    public int getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
