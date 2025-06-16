package org.example.collections.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseFlatMapEx {
    public static void main(String[] args) {
        List<List<String>> str = Arrays.asList(Arrays.asList("nana","bhanu","satya")
                ,Arrays.asList("kadam","bhanu","satya")
                ,Arrays.asList("bhai","bhanu","mamu"));
        List<String> collect = str.stream().flatMap(List::stream).distinct().collect(Collectors.toUnmodifiableList());
        System.out.println(collect);

        List<List<Integer>> str1 = Arrays.asList(Arrays.asList(1,2,4,1,3,4)
                ,Arrays.asList(4,5,6,7,1,2,3));
        System.out.println(str1);
        List<Integer> collect1 = str1.stream().flatMap(List::stream).distinct().collect(Collectors.toUnmodifiableList());
        System.out.println(collect1);
    }
}