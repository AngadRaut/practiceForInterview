package org.example.array;

import java.util.Arrays;

public class MultiplyArrayElementExceptOwn {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        // output = {24,12,8,6}
        int[] arr2 = new int[arr.length];
        int product = 1;
        for (int i = 0 ; i < arr.length ; i ++){
            product = product * arr[i];
        }
        System.out.println("Product : "+product);
        for (int i = 0 ; i < arr.length ; i ++){
            arr2[i] = product / arr[i];
        }
        for (int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr2[i]+",");
        }
        System.out.println(Arrays.toString(arr2));
    }
}
