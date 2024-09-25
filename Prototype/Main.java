package Prototype;

public class Main {
    public static void main(String[] args){
        Student student=new Student();
        student.setage(23);
        student.setName("rishav");
        student.setRollno(100);
        Student st = new Student(student);
        st.setName("rahul");

        Student copy = student.clone();//clone method is just a copy constructor
        copy.setRollno(109);

        StudentRegistry st2 =new StudentRegistry();
        st2.register("object2",student);
        Student st3 = st2.get("object2").clone();
    }
}
