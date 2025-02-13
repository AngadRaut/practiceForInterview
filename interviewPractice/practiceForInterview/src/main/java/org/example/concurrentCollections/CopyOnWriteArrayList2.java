package org.example.concurrentCollections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList2 {
    public static void main(String[] args) {
      //  List<Integer> list = new ArrayList<>();  // ConcurrentModificationException
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(11);
        list.add(13);
        list.add(56);
        list.add(23);
        System.out.println(list);

        // iterate and update the elements
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            Integer next = itr.next();
            System.out.println(next);
            if(next.equals(23)) {
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
