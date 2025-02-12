 package org.example.stringPractice;

// find the count of each character in the string
public class CountOfAllCharacters {
    public static void main(String[] args) {
        String name = "&ja*va  is progr.amming language#@";
        // 1. using character class methods
        int charNo = 0 ;
        for(int i = 0 ; i < name.length() ;i++ ){
            if(Character.isLetter(name.charAt(i))){
                charNo++;
            }
        }
        System.out.println("using character class methods \ntotal count of chars = "+charNo);

        // 2. using two for loop
        int count1 = 0 ;
        for(int i = 0 ; i < name.length() ; i++){
           /* if(name.charAt(i) != '&' || name.charAt(i) != '*'
                    || name.charAt(i) != '.' || name.charAt(i) != '#' || name.charAt(i) != ' ' || name.charAt(i) != '@'){
                count1++;
            }*/
            for(char ch = 'a'; ch<='z' ; ch++){
                if(name.charAt(i) == ch){
                    count1++;
                }
            }
        }
        System.out.println("\ncount using simple for and if condition\ntotal count of chars  = "+count1);

        // 3. by using the stream api
//        long count = name.chars().filter(a-> Character.isLetter(a)).count();
        long count = name.chars().filter(Character::isLetter).count();
        System.out.println("\nusing java 8 \n total count  = "+count);
    }
}
