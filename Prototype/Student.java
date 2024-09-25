package Prototype;


public class Student {
    private String name;
    private int age;
    private int rollno;

    public Student(){
    }

    public Student(Student other){
        this.age=other.age;
        this.name=other.name;
        this.rollno=other.rollno;
    }
    @Override
    public Student clone(){
        return new Student(this);
    }

    public void setName(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setRollno(int rollno){
        this.rollno=rollno;
    }

    public int getRollno(){
        return rollno;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
