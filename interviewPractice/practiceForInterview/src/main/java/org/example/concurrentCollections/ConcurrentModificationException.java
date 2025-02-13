package org.example.concurrentCollections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationException {
    public static void main(String[] args){
        List<String> list = Arrays.asList("nana","bhau","kadam","waghmare");
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>(list);

        Iterator<String> iterator = copyOnWriteArrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            String next = iterator.next();
            if(next.equals("bhau")){
                copyOnWriteArrayList.remove(next);
            }
            copyOnWriteArrayList.add("programming");
        }
        System.out.println(list+","+copyOnWriteArrayList);
    }
}