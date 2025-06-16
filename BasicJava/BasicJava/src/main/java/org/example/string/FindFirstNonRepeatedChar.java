package org.example.string;

public class FindFirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "swiss";   // o/p : w
        int count = 1 ;
        for (int i = 0 ; i < str.length() ;i++){
            for (int j = i+1 ; j <str.length() -1 ; j++){
                if (str.charAt(i) == str.charAt(j)){

                }
            }
        }
    }
}