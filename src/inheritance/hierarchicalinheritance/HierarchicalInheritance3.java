package inheritance.hierarchicalinheritance;

class Person{
    void speak(){
        System.out.println("Person is speaking.");
    }
}

class Teacher extends Person{
    void teach(){
        System.out.println("Teacher teaches.");
    }
}

class Student extends Person{
    void study(){
        System.out.println("Student studies.");
    }
}
public class HierarchicalInheritance3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.speak();
        teacher.teach();

        Student student = new Student();
        student.speak();
        student.study();
    }
}
