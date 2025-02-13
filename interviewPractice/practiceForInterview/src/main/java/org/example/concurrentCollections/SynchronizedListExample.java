package org.example.concurrentCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListExample {
    public static void main(String[] args) {
        List<Integer> synchronizedList  = Collections.synchronizedList(new ArrayList<>());
        synchronizedList.add(12);
        synchronizedList.add(45);
        synchronizedList.add(88);
        synchronizedList.add(1);
        synchronizedList.add(5);
        synchronizedList.add(8);
        System.out.println("original list : "+synchronizedList);
        // create the thread
        Runnable runnable = ()-> {
            for(Integer i : synchronizedList){
                System.out.println(i+",");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}