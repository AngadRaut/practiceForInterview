package org.example.ObjectClass;

public class DoubleOperatorAndEqualsMethod {
     DoubleOperatorAndEqualsMethod(){}

    public static void main(String[] args) {
      /*  String s1 = "nana";
        String s2 = "bhanu";
        String s3 = null;
        System.out.println(s1.equals(s3));  //
        System.out.println(s1==s2);*/
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");

        System.out.println(s1 == s2);  // true
        System.out.println(s1 == s3);  // false
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1.equals(s3));  // true
    }
}