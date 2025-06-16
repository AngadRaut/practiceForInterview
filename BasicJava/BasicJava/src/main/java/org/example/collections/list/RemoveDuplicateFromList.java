package org.example.collections.list;

import java.util.*;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,6,8,9,9,1,2,3,54,6,7,9,1,2,3,4,6,7);
        List<Integer> list1 = list.stream().distinct().toList();
        System.out.println(list1);

        // storing in the hashSet
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);

    }
}