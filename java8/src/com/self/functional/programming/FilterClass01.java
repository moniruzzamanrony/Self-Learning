package com.self.functional.programming;

import com.self.functional.programming.dto.Employee;

import java.util.List;

public class FilterClass01 {
    public static void main(String[] args) {
        List<String> names = List.of("roni", "toni", "hena", "pinki");
        List<Integer> roles = List.of(1, 3, 2, 4, 5);
        List<Employee> employeeList = List.of(new Employee(1, "roni", 12000.0),
                new Employee(2, "roni", 12000.0));

        //Before JAVA 8
        for (String name : names) {
            if (!name.equals("roni")) {
                System.out.println(name);
            }
        }

        // Use Lambda Expression
        System.out.println("-----------------Names---------------------");
        names.stream().filter((name) -> !name.equals("roni")).forEach(System.out::println);


        System.out.println("-----------------Employess---------------------");
        employeeList.stream().filter(FilterClass01::getById).forEach(System.out::println);


        /**
         * forEach vs forEachOrder
         */
        System.out.println("******* parallel() and forEach() vs forEachOrdered() and sequential() ******");

        String sc = "i love coding";
        // Not use parallel() function
        sc.chars().forEach(res->{
            System.out.print((char) res);
        });

        System.out.println("");
        // Use parallel() function
        sc.chars().parallel().forEach(res->{
            System.out.print((char) res);
        });

        System.out.println("");
        // Use parallel() and forEachOrdered()  function
        sc.chars().parallel().forEachOrdered(res->{
            System.out.print((char) res);
        });
        System.out.println("");
        // sequential() = parallel() + forEachOrdered()
        sc.chars().sequential().forEach(res->System.out.print((char) res));
        System.out.println("");
    }

    public static boolean getById(Employee employee) {
        return employee.getId() != 1;
    }
}
