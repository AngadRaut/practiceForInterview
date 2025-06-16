package org.example.askedInInterview;

public class ReverseStringNotSpecialChar {
    public static void main(String[] args) {
        String str = new String("aOFng$adrJOIF@aut");  // tua$rda@gna
        String rev ="";
         int left=0;
         int right=str.length()-1;

        char[] carr=str.toCharArray();

         while(left<right){
             if(!((carr[left]>='a' && carr[left]<='z') || (carr[left]>='A' && carr[left]<='Z'))){
                 left++;
             }
             else if (!((carr[right]>='a' && carr[right]<='z') || (carr[right]>='A' && carr[right]<='Z'))) {
                 right--;
             }
             else {
                 char temp = carr[left];
                 carr[left++] = carr[right];
                 carr[right--] = temp;
             }
         }
        System.out.println(carr);
    }
}
