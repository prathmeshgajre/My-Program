package practicequestions;

public class SwappingNumbers {


    static void main() {

        int a=10,b=20,temp;

        System.out.println("Before swapping "+a+" "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping "+a+" "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping "+a+" "+b);

        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After swapping "+a+" "+b);

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping "+a+" "+b);

        b=a+b-(a=b);
        System.out.println("After swapping "+a+" "+b);


    }
}
