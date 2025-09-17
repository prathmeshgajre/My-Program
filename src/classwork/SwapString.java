package classwork;

public class SwapString {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Pune";
        String temp;

        System.out.println("Before swapping: ");
        System.out.println(s1);
        System.out.println(s2);

        temp = s1;
        s1 = s2;
        s2 = temp;

        System.out.println("After swapping: ");
        System.out.println(s1);
        System.out.println(s2);
    }
}