import java.util.*;
public class NumberGuessingGame {
    static Scanner input = new Scanner(System.in);
    static int max = 10;
    static int min = 1;
    static int randomNumber = min + (int) (Math.random() * ((max - min) + 1));

    public static void main(String args[]){
            System.out.println("Welcome to a number guessing game!");  
            //show messenge before input number. 
        for (int i= 0; i < 5 ;i++){ 
            System.out.print("Enter an integer between 1 and 10:");
            int myNumber = input.nextInt();   
            if ( myNumber > randomNumber ){
                System.out.println("Try a lower number!");
               if(i == 4){
                    System.out.println("You run out of guesses");
                    System.out.println("You have tried "+i+" times");
                    System.out.println("The anwser is "+ randomNumber +".");
                }
            }else if (myNumber < randomNumber ){
                System.out.println("Try a higher!");
                 if(i == 4){
                    System.out.println("You run out of guesses");
                    System.out.println("You have tried "+i+" times");
                    System.out.println("The anwser is"+ randomNumber +".");
                }
             }else if (myNumber == randomNumber ){
                System.out.println("Congratulation!");
                System.out.println("You have tried "+ i +" times");
                break;
           
            }else{
                System.out.println("please, Enter only number. ");
            }
        }
    }     
}


