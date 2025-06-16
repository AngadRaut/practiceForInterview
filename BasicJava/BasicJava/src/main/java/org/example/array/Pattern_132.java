package org.example.array;

public class Pattern_132 {
    public static void main(String[] args) {
//       int[] arr =  {1, 2, 3, 4};
//       int[] arr = {3, 1, 4, 2};
//       int[] arr = {6, 12, 3, 4, 6, 11, 20};
       int[] arr = {9,11,8,9,10,7};
//        int[] arr ={1, 4, 2, 5};
        boolean is132=false;
       for (int i = 0 ; i < arr.length - 2 ; i ++){
           is132 = false;
           for (int j = i + 1 ; j < arr.length - 1 ; j ++){
               for (int k = j+1; k < arr.length ; k ++){
                   if(arr[i]<arr[j] && arr[j]>arr[k] && arr[i] < arr[k]){
                       is132 = true;
                   }
               }
           }

       }
       if (is132 == true) System.out.println("132 pattern");
       else System.out.println("Not 132 Pattern");
    }
}
