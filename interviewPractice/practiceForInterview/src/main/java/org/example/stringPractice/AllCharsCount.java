package org.example.stringPractice;

import java.util.ArrayList;
import java.util.List;

public class AllCharsCount {
    public static void main(String[] args) {
        String string = "you are $@best jus124t you^& need som*%!@e practice.";
        // using simple for loop
        int count = 0;
        for(int i = 0 ; i < string.length() ; i++){
            if(Character.isLetter(string.charAt(i))){
                count++;
            }
        }
        System.out.println("all characters in given string :"+count);

        // using java 8
        List<Character> list = new ArrayList<>();
        for(int i = 0 ; i < string.length() ; i++){
            list.add(string.charAt(i));
        }
        System.out.println(list);
        long count1 = list.stream().filter(Character::isLetter).count();
        System.out.println("all characters in given string :"+count1);
    }
}
