package org.example.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlternateCharCount {
    public static void main(String[] args) {
        String str = "java programming language";
        // alternate chars and count
        int count = 0 ;
        for (int i = 0 ; i < str.length() ; i ++){
            if (i%2!=0){
                System.out.print(str.charAt(i));
                count++;
            }
        }
        System.out.println(count);
    }
}