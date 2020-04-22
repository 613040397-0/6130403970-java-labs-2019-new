package khamkae.suphissara.lab4;
/**
* Author:Suphissara KHamkae 
* ID: 613040397-0
* Sec: 1
* Date: January 7, 2020
*
**/
class Teacher extends PersonV2{
    private String teachingSubject;
    private int salary;

    public Teacher(String name, double height, double weight, 
    String str_dob, String teachingSubject, int salary) {
        super(name, height, weight, str_dob);
        this.teachingSubject = teachingSubject;
        this.salary = salary;
    } 
  
    public String getSubject() {
        return teachingSubject;
    }

    public void setSubject(String subject) {
        this.teachingSubject = subject;
    }

    public double getSalary() {
        return this.salary;
    }


    public void setGPA(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {

        return super.toString() + ", teachingSubject=" + teachingSubject + ", salary=" + salary;
    }
}