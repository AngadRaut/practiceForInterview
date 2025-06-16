package org.example.string;

public class SwapWithoutThirdVar {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "programming";
        str2 = str1.concat(str2);
        str1 = str2.substring(str1.length());
        System.out.println("str1 : "+str1);
        str2 = str2.substring(0,str2.length()-str1.length());
        System.out.println("Str2 : "+str2);
    }
}
