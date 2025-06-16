package org.example.logicBuilding;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0 ;
        System.out.println(a+","+b);
        for (int i = b ; i <= 15; i++){
            c = a+b;
            a=b;
            b=c;
            System.out.print(c+",");
        }
    }
}
