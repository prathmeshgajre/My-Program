package returntype;

public class VarReturn {
    int x = 100;

    int m1(int x)
    {
        System.out.println("m1 method");
        return x;
    }

    static void main() {

        VarReturn vr = new VarReturn();

        int a = vr.m1(20);
        System.out.println(a);
    }
}
