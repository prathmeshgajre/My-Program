package returntype;

public class InsReturn {

    int y = 100;

    int m1(){
        System.out.println("m1 method");
        return y;
    }

    static void main() {
        InsReturn ir = new InsReturn();

        int a = ir.m1();
        System.out.println(a);
    }
}
