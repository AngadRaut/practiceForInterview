package org.example.string;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {4,5,7,4,2,6,9,0,6,7,9,87};
        System.out.println(Arrays.toString(array));
        int secondMax = array[0];
        int max = array[0];
        for (int i = 0 ; i < args.length ; i++ ){
            if (array[i]>max ){
                max= array[i];
            }if (array[i] > secondMax && array[i]!= max){
                secondMax = array[i];
            }
        }
        System.out.println(max+" "+secondMax);
    }
}