package org.example.immutableClass;

public class FinalVsImmutablity {
    public static void main(String[] args) {
        String str1="ahixhi";   // 1
        String str="hhiahijhixhijhi";  // 2
        int count = 0 ;
        for(int i = 0 ; i < str.length()-2 ; i++){
            if(str.charAt(i) != 'x' && str.charAt(i+1) == 'h' && str.charAt(i+2) == 'i'){
                count++;
            }
        }
        System.out.println(count);
    }
}
