package Builder;

public class StudentBuilder {
    private int age;
    private int rollno;
    private String name;

    public StudentBuilder setAge(int age){//void
        this.age=age;
        return this; // returns the studentbuilder object no need to create
    }

    public int getAge(){
        return age;
    }

    public StudentBuilder setRollno(int rollno){
        this.rollno=rollno;
        return this;

    }

    public int getRollno(){
        return rollno;
    }
    public StudentBuilder setName(String name){
        this.name=name;
        return this;
    }

    public String getName(){
        return name;
    }
    public  Student build(){
        return new Student(this);
    }
}
