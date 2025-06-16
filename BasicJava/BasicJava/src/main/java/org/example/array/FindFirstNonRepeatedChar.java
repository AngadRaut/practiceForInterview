package org.example.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedChar {
    public static void main(String[] args) {
        char[] charArray = {'a','b','a','b','c'};
        String str = new String(charArray);
        System.out.println("String : "+str);
        LinkedHashMap<Character, Long> collect = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        Character c = collect.entrySet().stream().filter(a -> a.getValue() == 1).map(map -> map.getKey()).findFirst().orElseThrow(() -> new RuntimeException("Not Found"));
        System.out.println(c);
        System.out.println();
        System.out.println();
        // 2nd way to do the above problem
        Map<Character,Long> map = new LinkedHashMap<>();
        for(char ch : charArray){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1L);
            }
        }
        System.out.println(map);
        for (Map.Entry<Character, Long> ch: map.entrySet()){
            if(ch.getValue() == 1){
                System.out.println(ch.getKey());
            }
        }
    }
}
