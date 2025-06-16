package org.example.staticKeyword;

public class StaticProperties {
   private static int b ;
    static int a ;
    public static void main(String[] args) {
        StaticProperties obj1 = new StaticProperties();
        obj1.a=100;

        StaticProperties obj2 = new StaticProperties();
        System.out.println(obj2.a);
        System.out.println(StaticProperties.b);
    }
}
class CHeck{
    public void print(){

    }
}
