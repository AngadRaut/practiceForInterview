package org.example.array;

import java.util.*;
import java.util.stream.Collectors;

public class SortDuplicatesDesc_notUnique {
    public static void main(String[] args) {
        /*13. Given an array of integers, find and sort the duplicate elements in descending order without disturbing the position of the unique ones.
        input = [3,2,5,2,3,7,8,4]
        output = [3,3.5,2,2,7,8,4]*/
        int[] arr = {3,2,5,2,3,7,8,4};
        System.out.println("Original array: "+Arrays.toString(arr));

        // declare map to find count of each element in array
        Map<Integer, Long> collect = Arrays.stream(arr).mapToObj(no -> no).collect(Collectors.groupingBy(a -> a,LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);

        // create new list and add duplicates in it
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (collect.get(i) > 1) {
                list.add(i);
            }
        }
        System.out.println("list contains duplicates: "+list);
        // new sort the duplicates in desc order
        list.sort(Collections.reverseOrder());
        System.out.println("Sorted list containing only duplicates:"+list);

        int dup = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if (collect.get(arr[i])>1){
                arr[i] = list.get(dup);
            dup++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}