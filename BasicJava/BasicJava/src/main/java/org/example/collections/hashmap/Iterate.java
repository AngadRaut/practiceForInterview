package org.example.collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterate {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("nna",4);
        map.put("kk",3);
        map.put("tru",2);
        map.put("kk",1000);
        map.put("tru",2000);
        System.out.println(map);
        map.entrySet().stream().forEach(System.out::println);
        for (Map.Entry<String,Integer> map2 : map.entrySet()){
            System.out.println(map2.getKey()+","+map2.getValue());
        }
        // simple for loop
        Iterator<Map.Entry<String, Integer>> iterator =
                map.entrySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next().getKey();
            Integer value = iterator.next().getValue();
            System.out.println(key+":"+value);
        }
    }
}