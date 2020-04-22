package khamkae.suphissara.lab2;
/**
* This Calculator program is accept three argument  : string1 , string2 string3 .
* Output form is "Quitting the program." in case that argument length not equals three.
* and showing answer of calculation when argument length equals three .
* Author:Suphissara KHamkae 
* ID: 613040397-0
* Sec: 1
* Date: December 16, 2019
*
**/
public class Calculator {
    public static void main(String args[]) {
        String input1 = args[0].toLowerCase();
        String input2 = args[1];
        String input3 = args[2];
       // accept input 3 agrument 
        
       
       if(input1 == "q"){
         System.out.println("Quitting the program.");
         System.exit(0);  
         //wrong input case 
          
         double num1 = Double.parseDouble(input2); 
         double num2 = Double.parseDouble(input3); 
         double sum = 0.00 ;
           //Change type visible 

            if(input1 == "/" ){
                // every condition to calculate 
                if(input1 == "*" ){
                    sum = num1 * num2 ;
                    System.out.println(num1 +" * "+ num2 + "=" + sum ) ;  
                }else if(input1 == "+" ){
                    sum = num1 + num2 ;
                    System.out.println(num1 +" + "+ num2 + "=" + sum ) ;
                }else if(input1 == "-" ){
                    sum = num1 - num2 ;
                    System.out.println(num1 +" - "+ num2 + "=" + sum ) ;
                }else 
                    if(num2 == 0){
                        System.out.println("The second operand cannot be zero");
                    }else{
                        sum = num1/num2 ;    
                        System.out.println(num1 +""+ num2 + "=" + sum ) ;
                    } 
                }
            }else{
            }
    }
}