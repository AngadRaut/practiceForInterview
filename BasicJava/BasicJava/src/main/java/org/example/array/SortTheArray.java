package org.example.array;

import java.util.Arrays;

public class SortTheArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}