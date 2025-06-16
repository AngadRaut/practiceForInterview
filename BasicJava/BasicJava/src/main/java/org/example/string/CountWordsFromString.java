package org.example.string;

import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordsFromString {
    public static void main(String[] args) {
        // find the count of the words in string and also the count of each word
        String str = "programming the java is java is simple programming";
        String[] arr = str.split(" ");
      /*  System.out.println("Total words : "+arr.length);
        System.out.println(Arrays.toString(arr));
        Map<String,Long> count = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        count.forEach((key,value)->System.out.println(key+":"+value));
*/
        Map<String,Integer> map = new HashMap<>();
        // use the map and getOrDefault() method form the amp
        for (String string : arr){
            string = string.toLowerCase();
            map.put(string,map.getOrDefault(string,0)+1);
        }
        map.forEach((key,value)->System.out.println(key+":"+ value));
    }
}
