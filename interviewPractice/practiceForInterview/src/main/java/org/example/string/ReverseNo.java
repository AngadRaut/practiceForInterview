package org.example.string;

public class ReverseNo {
    public static void main(String[] args) {
        int a = 789;
        int b = 0 ;
        while(a>0){
            b = b*10+a%10;
            a= a/10;
        }
        System.out.println(b);
    }
}   