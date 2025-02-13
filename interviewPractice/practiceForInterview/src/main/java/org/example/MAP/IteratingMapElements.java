package org.example.MAP;

import java.util.concurrent.ConcurrentHashMap;

import java.util.HashMap;
import java.util.Map;

public class IteratingMapElements {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("nana",5);
        map.put("bhau",4);
        // iterating over key
        System.out.println("original map : "+map+"\n");
        for(String s : map.keySet()){
            System.out.print(s+",");
        }
        System.out.println();
        // iterating over value
        for(Integer s : map.values()){
            System.out.print(s+",");
        }
        System.out.println();
        // iterating over key-value
        for(Map.Entry<String,Integer> s : map.entrySet()){
            System.out.print(s+",");
        }
        // using entrySet separate key and value
        for(Map.Entry<String,Integer> s : map.entrySet()){
            System.out.print(s.getKey()+","+s.getValue());
        }
    }
}

