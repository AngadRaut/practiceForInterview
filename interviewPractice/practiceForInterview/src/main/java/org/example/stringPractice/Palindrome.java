package org.example.stringPractice;

public class Palindrome {
    public static void main(String[] args) {
        String string = "1nanan1";
        String string2 = "";
        for (int i = string.length()-1; i >=0 ; i--){
            string2 = string2 + string.charAt(i);
        }
        if(string.equals(string2)){
            System.out.println("string is palindrome");
        }else {
            System.out.println("not");
        }
        // using string buffer

    }
}
