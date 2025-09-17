package oops;
abstract class AbstractClass{

    int a;
    final int b = 20;
    static int c = 30;

    abstract void m1();
    static void m2(){
        System.out.println("Static method in abstract class");
    }

    void m3(){
        System.out.println("Instance method in abstract class");
    }
    AbstractClass(){
        int a = 10;
        System.out.println("value of a " +a);
    }

    static {
        System.out.println("static block in abstract class");
    }
    {
        System.out.println("instance block in abstract class");
    }

    private void m4(){
        System.out.println("private method");
    }
    protected void m5(){
        System.out.println("protected method");
    }
}
class A extends AbstractClass{
    void m1(){
        System.out.println("Implementation of abstract method");
    }
}
public class AbstractTest {
    static void main() {
        A a = new A();
        System.out.println(a.b);
        System.out.println(AbstractClass.c);
        a.m1();

        AbstractClass.m2();
        a.m3();
        a.m5();
    }
}
