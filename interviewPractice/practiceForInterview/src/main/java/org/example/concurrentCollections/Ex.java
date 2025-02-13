package org.example.concurrentCollections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Ex {
    public static void main(String[] args) {
        Map hashMap = new TreeMap<>();
        Map<Integer,String> synchronizedMap = Collections.synchronizedMap(hashMap);
        Map<String,String> concHashMap = new ConcurrentHashMap<>();
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashMap.put(1,"one");
        hashMap.put(2,"two");
        hashMap.put(90,null);
        hashMap.put(13,null);
        hashMap.put(11,null);
        System.out.println(synchronizedMap);
        // for concHashMap
        concHashMap.put("nana","bhanu");
        concHashMap.put("raju","bhabhanudasnu");
//        concHashMap.put("jjfht",null);
//        concHashMap.put(null,null);
        System.out.println(concHashMap);
        // for hash table



    }
}
