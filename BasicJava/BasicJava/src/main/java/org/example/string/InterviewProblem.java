package org.example.string;

import java.util.Arrays;

public class InterviewProblem {
    public static void main(String[] args) {
        String str = "interview 1 test";
        char[] arr = str.toCharArray();
        // o/p : "interview 1 test, interview 2 test, interview 3 test, interview 4 test, interview 5 test"
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < arr.length ; i++){
            int num = 0 ;
            if (Character.isDigit(arr[i])){
                num+= Integer.valueOf(arr[i]);
//                sb.append();
            }
        }
        Arrays.toString(arr);
    }
}