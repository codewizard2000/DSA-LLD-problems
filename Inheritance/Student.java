package Inheritance;

public class Student extends Coaching{
    public String name;
    public Integer rollNumber;

    public Student(String name ,Integer rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
    }

    public void Marks(){
        System.out.println("this is marks of "+name+" and his roll number is "+rollNumber);
    }



}
