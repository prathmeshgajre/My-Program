package constructor;

class Demo1{
    static String name;
    static int age;

    Demo1(){
        System.out.println("0-args constructor of parent class");
        this(10);
    }

    Demo1(int a){
        System.out.println("1-args constructor of parent class");
    }

    Demo1(String name,int age){
        this.name = name;
        this.age = age;
    }



}
public class Demo extends Demo1 {

    Demo(){
        System.out.println("0-args constructor of child class");
        this(10);
    }

    Demo(int b){
        System.out.println("1-args constructor of child class");
        super();
    }

    public static void main(String[] args) {
        Demo demo;
        demo = new Demo();

        System.out.println(Demo1.name + Demo1.age);

    }
}
