package khamkae.suphissara.lab4;
/**
* Author:Suphissara KHamkae 
* ID: 613040397-0
* Sec: 1
* Date: January 7, 2020
*
**/

public class TestPersonV3 {
    public static void main(String[] args) {
        Teacher onizuka = new Teacher("Onizuka", 185, 80, "1998-07-07", "social study", 15000);
        Student zuckerberg = new Student("Zucherburg", 180, 25, "1984-05-14", "Computer Engineering", 4.0);
        System.out.println(onizuka);
        System.out.println(zuckerberg);
        onizuka.howOld();
        zuckerberg.howOld();
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
        PersonV2 micky = new PersonV2("Micky Mouse", 60, 25, "1982-01-01");
        System.out.println(micky);
        micky = new Student("Micky Mouse", 60, 25, "1982-01-01", "Animation", 3.0);
        System.out.println(micky);
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
        micky.compareAge(onizuka);
    }
}