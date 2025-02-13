package org.example.concurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailSafe {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        Iterator<Integer> itr = integers.iterator();
        while (itr.hasNext()) {
            Integer a = itr.next();
            itr.remove();
        }
        System.out.println(integers);
    }
}
