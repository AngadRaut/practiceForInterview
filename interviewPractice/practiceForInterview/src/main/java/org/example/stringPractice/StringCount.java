package org.example.stringPractice;

public class StringCount {
    public static void main(String[] args) {
        String string = "language java is language language";
        String[] arr = string.split(" ");
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].equals("language")){
                count++;
            }
        }
        System.out.println(count);
    }
}
