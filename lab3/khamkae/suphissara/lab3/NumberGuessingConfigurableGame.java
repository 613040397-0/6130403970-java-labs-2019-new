package khamkae.suphissara.lab3;
/**
Author:Suphissara KHamkae
* ID: 613040397-0
* Sec: 1
* Date: December 16, 2019
***/
import java.util.*;
public class NumberGuessingConfigurableGame  {
static Scanner input = new Scanner(System.in);
static int max , min ,numTries , randomNumber ,myNumber ;
static String replay;
static int i = 0 ;
public static void configure(){
    System.out.println("Enter the min value :");
        min = input.nextInt();
    System.out.println("Enter the max value :");
        max = input.nextInt();
    System.out.println("Enter the maximum number of tries :");
        numTries = input.nextInt();
    System.out.println(" Welcome to a number guessing game ! ");
    System.out.println("Enter an integer between " + max +" and "+ min + " :") ;//show messenge before input number.
        myNumber = input.nextInt();
}
public static void genAnswer(){
        randomNumber = min + (int) (Math.random() * ((max - min) + 1));
}
public static void playGames(){
    for (int i= 0; i < numTries  ;i++){ 
        if (myNumber > randomNumber) {
            System.out.println("Try a lower number!");
            if (i == numTries) {
                System.out.println("You run out of guesses");
                System.out.println("You have tried " + i + " times");
                System.out.println("The anwser is" + randomNumber + ".");
                System.out.println("Want to play again(Y or y) : ");
                while(true){
                    if (replay == "Y" || replay == "y") { 
                        replay = input.nextLine();
                    }else{
                        System.out.println("Thank you for playing our games . Bye!");
                    }
                }  
            }
            
                

        } else if(myNumber < randomNumber) {
            System.out.println("Try a higher!");
                if (i == numTries) {
                System.out.println("You run out of guesses");
                System.out.println("You have tried " + i + " times");
                System.out.println("The anwser is" + randomNumber + ".");
                System.out.println("Want to play again(Y or y) : ");
                while(true){
                    if (replay == "Y" || replay == "y") { 
                        replay = input.nextLine();
                    }else{
                        System.out.println("Thank you for playing our games . Bye!");
                    }
                }  
            }
            
        }else if (myNumber == randomNumber) {
            System.out.println("Congratulation!");
            System.out.println("You have tried " + i + " times");
            while(true){
                if (replay == "Y" || replay == "y") { 
                    replay = input.nextLine();
                }else{
                    System.out.println("Thank you for playing our games . Bye!");
                }
            }  
            
        } else if (i == numTries) {
            System.out.println("You run out of guesses");
            System.out.println("You have tried " + i + " times");
            System.out.println("The anwser is" + randomNumber + ".");
            
        }else{
            break;
        }
    }    
}





public static void main(final String args[]) {
    configure();
    playGames();
    genAnswer();
}
}
