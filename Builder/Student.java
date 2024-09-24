package Builder;

public class Student {
    private int age;
    private int rollno;
    private String name;


    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public Student(StudentBuilder sb){
        this.age=sb.getAge();
        this.name=sb.getName();
        this.rollno= sb.getRollno();
        if(age>30) throw new IllegalArgumentException("AGe is too large to be student ");

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }


}

