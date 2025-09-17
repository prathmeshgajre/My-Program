package returntype;

public class School {

    Student m1(){
        System.out.println("m1 method");
        /*Student st = new Student();
        return st;*/
        return new Student();
    }

    Employee m2(){
        System.out.println("m2 method");
        Employee emp = new Employee();
        return new Employee();
    }

    static String m3(){
        System.out.println("ram");
        return "ram";
    }

    public static void main(String[] args)
    {
        School sc = new School();

        Student s = sc.m1();
        System.out.println(s);
        Employee e = sc.m2();
        System.out.println(e);
        String str = School.m3();
        System.out.println(str);
    }
}
