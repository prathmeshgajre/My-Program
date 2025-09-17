package classwork;

public class SwapVariable {

    public static void main(String[] args) {

        //using temp variable
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

        System.out.println("---------------------------");

        //without using temp variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
