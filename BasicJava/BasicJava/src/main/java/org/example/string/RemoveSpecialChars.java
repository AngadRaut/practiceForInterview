package org.example.string;

public class RemoveSpecialChars {
    public static void main(String[] args) {
        String str = "java@ IS nOT &% $ # CHARS**!@";
        for (int i = 0 ; i < str.length() ; i ++){
            if (!Character.isSpaceChar(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
        }
    }
}
