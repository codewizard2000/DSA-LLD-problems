package Builder;

public class Main {
    public static void main(String[] args){
        StudentBuilder sb = Student.getBuilder();
      //  StudentBuilder sb=new StudentBuilder();  this changes is done because of build method
//        sb.setAge(19);
//        sb.setRollno(100);
//        sb.setName("rishav");

//        Student s =sb.build();
       // Student s = new Student(sb);

        Student st = Student.getBuilder()
                .setAge(20)
                .setName("ris")
                .setRollno(112)
                .build();


        // studentbuilder object created in backend so now just call build

        System.out.print(st);




    }
}
