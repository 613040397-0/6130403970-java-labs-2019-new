package khamkae.suphissara.lab4;
/**
* Author:Suphissara KHamkae 
* ID: 613040397-0
* Sec: 1
* Date: January 7, 2020
*
**/
public class TestPersonV2 { 
    public static void main(String[] args) {
        PersonV2 doraemon = new PersonV2("Doraemon", 100, 100, "2017-05-26");
        PersonV2 nobita = new PersonV2("Nobita", 120, 25, "2012-01-05");
        System.out.println(doraemon);
        System.out.println(nobita);
        doraemon.howOld();
        nobita.howOld();
        doraemon.compareAge(nobita);
        nobita.compareAge(doraemon);
        doraemon.isBirthday();
        nobita.isBirthday();
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
    }
}