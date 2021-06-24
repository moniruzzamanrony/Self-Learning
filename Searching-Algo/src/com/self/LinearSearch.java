package com.self;



import java.util.List;


public class LinearSearch {

    public static void main(String[] args) {

	System.out.println(linearSearch(List.of(1,2,34,5,6), 123));
    }

    private static int linearSearch(List<Integer> dataSet, int target) {

        return dataSet.stream().filter(res-> res == target).findFirst().orElse(-1);

    }
}
