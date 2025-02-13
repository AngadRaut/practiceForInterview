package org.example.stringPractice;

// reverse the string
public class Reverse {
    public static void main(String[] args) {
        String s = "java";
        for(int i  = s.length()-1 ; i >=0 ; i--){
            System.out.print(s.charAt(i));
        }
    }
}
