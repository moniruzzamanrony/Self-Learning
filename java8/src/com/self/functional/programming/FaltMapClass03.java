package com.self.functional.programming;

import com.self.functional.programming.dto.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FaltMapClass03 {
    public static void main(String[] args) {
        List<User> userList = List.of(new User(1, List.of(1,3,5)),
                new User(2, List.of(2,4,6)));

       List<Integer> userOptional =userList.stream().filter(res-> res.getId() == 11)
               .map(User:: getNums).findAny().orElseThrow();
      System.out.println(userOptional);


    }
}
