package org.example.MAP;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapCustomSorting {
    public static void main(String[] args) {
        SortByValue ref  = new SortByValue();

        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(11,"eleven");
        treeMap.put(12,"twelve1");
        treeMap.put(16,"sixteen");
        treeMap.put(90,"ninety");
        treeMap.put(50,"fifty");
        treeMap.put(12,"twelve2");
        System.out.println(treeMap);
        SortByValue value = new SortByValue();


    }
}
class SortByValue implements Comparator<Map.Entry<Integer,String>> {

    @Override
    public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
        return -(o1.getKey().compareTo(o2.getKey()));
    }

  /*  @Override
    public int compare(Map<Integer, String> o1, Map<Integer, String> o2) {
        return o1.get().compareTo(o2.getKey());
    }*/
}
