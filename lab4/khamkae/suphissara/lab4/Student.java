package khamkae.suphissara.lab4;
/**
* Author:Suphissara KHamkae 
* ID: 613040397-0
* Sec: 1
* Date: January 7, 2020
*
**/



class Student extends PersonV2 {
    private String major;
    private double GPA;

    Student(String name, double height, double weight, String str_dob, String major, double GPA) {
        super(name, height, weight, str_dob);
        this.major = major;
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }


    public void setMajor(String major) {
        this.major = major;
    }


    public double getGPA() {
        return this.GPA;
    }


    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return super.toString() + ", major=" + major + ", GPA=" + GPA;
    }

}