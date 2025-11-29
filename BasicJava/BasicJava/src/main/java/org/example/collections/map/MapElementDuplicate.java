package org.example.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapElementDuplicate {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"nana");
        map.put(1,"bhau");
        System.out.println(map);
    }
}
