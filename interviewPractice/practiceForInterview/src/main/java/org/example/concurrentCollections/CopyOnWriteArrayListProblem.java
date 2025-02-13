package org.example.concurrentCollections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListProblem {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("nana","bhanu","santosh","diga") ;
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(strings);
        System.out.println("List:"+strings+"\nCopyOnWriteArrayList:"+list);

        Iterator<String> itr = list.iterator();
        strings.add("nanaBhau148");
        Iterator<String> itr2 = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}