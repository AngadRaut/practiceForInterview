package org.example.MAP;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySetMethod {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<String, Integer>();

        map.put("1 - Bedroom" , 25000);
        map.put("2 - Bedroom" , 50000);
        map.put("3 - Bedroom" , 75000);
        map.put("1 - Bedroom - hall", 65000);
        map.put("2 - Bedroom - hall", 85000);
        map.put("3 - Bedroom - hall", 105000);
        map.put(null,99494);

        Hashtable<String , Integer> hashtable = new Hashtable<>();
        hashtable.put("table",null);   // throws NullPointerException
        System.out.println(hashtable);


        System.out.println("hashTable : "+hashtable);
        // iterate the map and change the values
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> m : entries){
            System.out.println("before changing the values : "+m.getKey()+":"+m.getValue());

            double v = Math.random() * 100000;
            int roundOf = (int) Math.round(v);

            m.setValue(roundOf);
            System.out.println("after changing the values : "+m.getKey()+":"+m.getValue()+"\n");
        }
    }
}
