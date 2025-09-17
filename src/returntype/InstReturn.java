package returntype;

public class InstReturn {
    int x = 100;

    int m1(int x){
        System.out.println("m1 method");
        return this.x;
    }

    static void main() {

        InstReturn itr = new InstReturn();
        int a = itr.m1(20);
        System.out.println(a);
    }
}
