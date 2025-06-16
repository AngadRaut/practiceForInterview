package org.example.array;

import java.util.Arrays;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,1,3,5,8,9};
        int[] array1 = Arrays.stream(arr).sorted().distinct().toArray();
//        int[] array = Arrays.stream(Arrays.stream(arr).toArray()).distinct().toArray();
        System.out.println(Arrays.toString(array1));

        // using simple for loops
        for(int i = 0 ; i < arr.length ; i++){
            for (int j = i+1 ; j < arr.length ; j ++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+",");
                }
            }
        }
    }
}