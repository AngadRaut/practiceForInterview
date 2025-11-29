package org.example.string;

public class CapitalizeFirstChar {
    public static void main(String[] args) {
        String str = "my name abcd";
        String str1 = "";
        String[] arr = str.split(" ");
        for (int i = 0 ; i < arr.length ; i++){
            str = arr[i];
            str = Character.toUpperCase(str.charAt(0))+str.substring(1);
            System.out.print(str+" ");
        }
        /*str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        System.out.println(str);*/
    }
}