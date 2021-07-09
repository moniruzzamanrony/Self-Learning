package com.self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(List.of(1,2,34,5,6), 123));
    }
    private static int binarySearch(List<Integer> dataSet, int target) {
        return dataSet.stream().filter(res-> res == target).findFirst().orElse(-1);

    }
}
