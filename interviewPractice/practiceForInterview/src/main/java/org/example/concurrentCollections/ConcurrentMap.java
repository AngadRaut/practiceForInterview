package org.example.concurrentCollections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {
    public static void main(String[] args) {
        java.util.concurrent.ConcurrentMap<Integer,String> concurrentMap = new ConcurrentHashMap<>();
       // Map<Integer,String> concurrentMap = new HashMap<>();    //  ConcurrentModificationException
        concurrentMap.put(11,"ram");
        concurrentMap.put(12,"sham");
        concurrentMap.putIfAbsent(12,"radhe");
        System.out.println(concurrentMap);

        Set<Integer> set = concurrentMap.keySet();
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            Integer next = itr.next();
            if (next.equals(11)){
//                concurrentMap.remove(next);
                itr.remove();
            }
        }
        System.out.println(concurrentMap);
        System.out.println(set);
    }
}
