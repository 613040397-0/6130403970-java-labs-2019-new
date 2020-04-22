package khamkae.suphissara.lab2;
/**
 * This Athlete program is to accept three arguments: athlete name, the sport name 
*  that that athlete plays, and the nationality of that athlete.  Its output format is
*  My favorite athlete is <athlete_name> who plays <sport_name> and has 
*  nationality as <athlete_nationality>  
*
* Author:Suphissara KHamkae
* ID: 613040397-0
* Sec: 1
* Date: December 16, 2019
*
**/
public class Athlete {
    public static void main(String args[]) {
      if (args.length != 3){
        System.out.println("Athlete<athlete name><sport name><Nationality>");
        //show messenge in case that  accept input not equals 3 . 
    }else{
        String athleteName = args[0]; //variable name of frist input .
        System.out.println("My favorite athlete is" +athleteName );
        String sportName = args[1]; //variable name of second input .
        System.out.println("who plays"+sportName ); 
        String athleteNationality = args[2]; //variable name of third input .
        System.out.println("and has nationality as" +athleteNationality);

        }   
    }
}
