package inheritance.singleinheritance;

class Person{
    void speak(){
        System.out.println("Person can speak..");
    }
}

class Student extends Person{
        void study(){
            System.out.println("Student is studying..");
        }
}
public class SingleInheritance2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.speak();
        student.study();
    }
}
