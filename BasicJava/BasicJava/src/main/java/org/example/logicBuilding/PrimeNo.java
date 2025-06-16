package org.example.logicBuilding;

public class PrimeNo {
    public static void main(String[] args) {
        int no = 12;
        boolean isPrime = true;
        for(int i = 2 ; i <= Math.sqrt(no); i++){
            if (no%i==0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("Prime");
        }else {
            System.out.println("Not");
        }
    }
}
