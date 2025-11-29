package org.example.array;

import java.util.Arrays;

public class AlternatePositiveNegative {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,23,6,2,-1,-4,-90,-67,-56,-33,1,2,3,4,5,6,7};
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = i+1 ; j < arr.length ; j++){
                if (i%2==0){
                    if (arr[i]<0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}