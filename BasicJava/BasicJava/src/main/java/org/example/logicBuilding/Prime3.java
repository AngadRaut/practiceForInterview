package org.example.logicBuilding;

import java.time.LocalDate;

public class Prime3 {
    public static void main(String[] args) {
        int no = 13;
        boolean isPrime = true;
        for (int i = 2; i <= no/2; i++) {
            if (no % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        System.out.println(LocalDate.now());
    }
}
