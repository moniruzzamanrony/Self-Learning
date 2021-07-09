package com.self.functional.programming.dto;

import java.util.List;

public class User {
    private int id;
    private List<Integer> nums ;

    public User(int id, List<Integer> nums) {
        this.id = id;
        this.nums = nums;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getNums() {
        return nums;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nums=" + nums +
                '}';
    }
}
