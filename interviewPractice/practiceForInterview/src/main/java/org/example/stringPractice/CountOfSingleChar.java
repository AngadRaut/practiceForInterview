package org.example.stringPractice;


public class CountOfSingleChar {
    public static void main(String[] args) {
        String string = "i am studying in tdit java institute";
        int countOfI = 0 ;
        for(int i = 0 ; i < string.length() ; i++){
            if(string.charAt(i) == 'i'){
                countOfI++;
            }
        }
        System.out.println("count of i = "+countOfI);
    }
}