package org.example.collections.list;

import java.util.*;

public class FindOutDuplicateFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,6,8,9,9,1,2,3,54,6,7,9,1,2,3,4,6,7);
        Iterator<Integer> iterator = list.iterator();
        Set<Integer> set = new HashSet<>();
        for (Integer i : list){
            if (!set.add(i)){
                set.add(i);
            }
        }
        System.out.println(set);
    }
}