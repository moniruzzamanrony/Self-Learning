package com.self;

import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(List.of(1,2,34,5,6), 123));
    }
    private static int binarySearch(List<Integer> dataSet, int target) {

        return dataSet.stream().filter(res-> res == target).findFirst().orElse(-1);

    }
}
