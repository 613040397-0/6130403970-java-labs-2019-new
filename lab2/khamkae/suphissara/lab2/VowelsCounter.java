package khamkae.suphissara.lab2;
/**
* This VowesCouter program is accept one argument  : word .
* it's working with "for loop" . Output form is " Total number of vowel(s) is <vowelsCount>".
* Author:Suphissara KHamkae
* ID: 613040397-0
* Sec: 1
* Date: December 16, 2019
***/
public class VowelsCounter {
    public static void main(String[] args) {

        String word = args[0].toLowerCase() ; 
        int vowel = 0 ;

        for (int i=0; i<word.length(); i++ ) {
            //loop for which main function to make program working 
            char ch = word.charAt(i) ;
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowel ;
                System.out.println("Total number of towels is " + vowel) ;
            }
        }
   
    }
}
