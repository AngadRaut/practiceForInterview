package org.example.array;

public class FindAdditionPair {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6}; // targetValue = 8
        int targetValue = 8;
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = i+1; j < arr.length ; j++){
                if (arr[i]+arr[j] == targetValue){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}