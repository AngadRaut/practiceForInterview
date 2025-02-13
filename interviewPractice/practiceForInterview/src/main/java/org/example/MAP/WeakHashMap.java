package org.example.MAP;

import java.util.HashMap;
import java.util.Map;

public class WeakHashMap {
    public static void main(String[] args) {

        Map<Object, String> hashMap = new java.util.WeakHashMap<>();
        Temp temp = new Temp();
        hashMap.put(temp,"one");
        System.out.println("hashMap1 : "+hashMap);
        temp = null;
        System.gc();
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.getMessage();
        }
        System.out.println("hashMap1 : "+hashMap);
    }
}

class Temp{
    public String toString(){
//        System.out.println("toString() method");
        return "temp";
    }
    public void finalize(){
        System.out.println("finalize() method");
    }
}