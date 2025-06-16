package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class UniqueWordsSortingAlph {
    public static void main(String[] args) {
        // find the unique words and arrange alphabetically
        String str = "java is a programming language java is fun powerful a";
        String[] arr = str.split(" ");
        List<String> collect = Arrays.stream(arr).distinct().sorted().toList();

        System.out.println(collect);
        IntStream sorted = str.chars().distinct().sorted();
    }
}