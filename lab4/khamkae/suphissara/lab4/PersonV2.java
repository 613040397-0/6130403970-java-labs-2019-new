package khamkae.suphissara.lab4;
/**
* Author:Suphissara KHamkae 
* ID: 613040397-0
* Sec: 1
* Date: January 7, 2020
*
**/
import java.time.LocalDate;

public class PersonV2 extends Person {
    private LocalDate dob;
    public PersonV2(String name, double height, double weight, String str_dob) {
  
        super(name, height, weight);
        this.dob = LocalDate.parse(str_dob);
    }
    

    public void setDOB(String dob) {
        this.dob = LocalDate.parse(dob);
    }

    public LocalDate getDob() {
        return dob;
    } 
        LocalDate today = LocalDate.now();
        int birthDay = dob.getDayOfMonth(); 
        int birthMonth = dob.getMonthValue(); 
        int nowDay = today.getDayOfMonth(); 
        int nowMonth = today.getMonthValue(); 
        if (birthDay == nowDay && birthMonth == nowMonth) {
            System.out.println("Today is " + getName() + "'s Birthday.");
        }else {
            System.out.println("Today is NOT " + getName() + "'s Birthday.");
        }
    }
   
    public void howOld() {
        LocalDate today = LocalDate.now();
        int birthDay = dob.getDayOfMonth();
        int birthMonth = dob.getMonthValue();
        int birthYear = dob.getYear();
        int nowDay = today.getDayOfMonth();
        int nowMonth = today.getMonthValue();
        int nowYear = today.getYear();
        int yearOld = Math.abs(nowYear - birthYear);
        int monthOld = Math.abs(nowMonth - birthMonth);
        int dayOld = Math.abs(nowDay - birthDay);
        System.out.println(getName() + " is " + yearOld + " years " 
        + monthOld + " months and " + dayOld + " days" + " old.");
    }

    public void compareAge(PersonV2 another) {
        LocalDate BirthDayPerson1 = this.dob;
        LocalDate BirthDayPerson2 = another.dob;

        int birthDay1 = dob.getDayOfMonth();
        int birthMonth1 = dob.getMonthValue();
        int birthYear1 = dob.getYear();

        int birthDay2 = another.dob.getDayOfMonth();
        int birthMonth2 = another.dob.getMonthValue();
        int birthYear2 = another.dob.getYear();

        int diffDay = birthDay1 - birthDay2;
        int diffMonth = birthMonth1 - birthMonth2;
        int diffYear = birthYear1 - birthYear2;
        int compair = BirthDayPerson1.compareTo(BirthDayPerson2);


        if (compair > 1) {
            System.out.println(another.getName() + " is " +  diffYear + " years " 
            + diffMonth + " months " + diffDay + " days older than " + this.getName());
        }else {
            System.out.println(this.getName() + " is " +  (-diffYear) + " years " 
            + (-diffMonth) + " months " + (-diffDay) + " days older than " + another.getName());
        }
    }

    @Override
    public String toString()
    {
        return "name=" + getName() + ", height=" 
        + getHeight() + " cm. weight=" + getWeight() + " kg., Birthday=" + dob ;
    }
}
