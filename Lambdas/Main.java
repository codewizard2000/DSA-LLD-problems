package Lambdas;

public class Main {
    public static void main(String[] args){
        MyInterFaceImpl iml = new MyInterFaceImpl();
        iml.sayhello();


// anonymous method  is created here
        MyInterface i = new MyInterface() {
            @Override
            public void sayhello() {
                System.out.print("hi this is anonymous class");
            }
        };
        i.sayhello();


        MyInterface i2 = ()->System.out.print("this is lamdas");
        i2.sayhello();

        MySum sum1 = (int a,int b)->{
            return a+b;
        };
        System.out.print(sum1.sum(5,3));

    }
}
