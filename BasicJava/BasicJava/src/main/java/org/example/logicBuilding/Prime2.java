package org.example.logicBuilding;

public class Prime2 {
    public static void main(String[] args) {
        int no = 11;
        boolean isPrime = true;
        int i = 2;
        while (i <= (no/2)){
            if(no%i==0){
                isPrime=false;
                break;
            }
            i++;
        }
        if(isPrime) {System.out.println("prime");}
        else {System.out.println("not prime");
    }}
}
