package org.example.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindRepeatedNo_N_Time {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 4, 5, 5, 6, 7, 9, 3, 4, 6, 5, 7, 3};
        int k = 3;
        int count = 1;
        Map<Integer,Long> map = new LinkedHashMap<>();
        for (Integer i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else{
                map.put(i,1L);
            }
        }
        System.out.println(map);
    }
}