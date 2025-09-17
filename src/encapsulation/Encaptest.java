package encapsulation;

public class Encaptest {
    static void main() {

        Student obj = new Student();

        obj.setStdName("kiran");
        obj.setStdRollNo(12);
        obj.setStdId(12345);

        System.out.println(obj.getStdName());
        System.out.println(obj.getStdRollNo());
        System.out.println(obj.getStdId());
    }
}
