package org.example;

public class FibonaciiSeries {
    public static void main(String[] args) {
        int a = 0 ;
        int b = 1 ;
        System.out.print(a+","+b+",");
        while(b < 50 ){
            int c = a + b ;
            a = b;
            b = c;
            System.out.print(c+",");
        }
    }
}
