package org.example.logicBuilding;

public class Factorial {
    public static void main(String[] args) {
        int no = 4;
        int factorial= 1;
        for (int i = 1 ; i <= no ; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
