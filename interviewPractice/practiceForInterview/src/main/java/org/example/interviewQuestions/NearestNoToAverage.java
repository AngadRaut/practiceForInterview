package org.example.interviewQuestions;

import java.util.*;

public class NearestNoToAverage {
    public static void main(String[] args) {
       String string =  "723098721341";
       char[] arr = string.toCharArray();
       System.out.println(Arrays.toString(arr));
       List<Integer> list = new ArrayList();
       for(char ch : arr){
           list.add(Character.getNumericValue(ch));
       }
       System.out.println(list);
       // now calculate the average of the given string
       Double average = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
       System.out.println("average : "+average);

//        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        int c = list.stream()
                .min(Comparator.comparingInt(i -> (int) Math.abs(i - average)))
                .orElseThrow(() -> new NoSuchElementException("No value present"));
        System.out.println("no nearest to average : "+c);
    }
}