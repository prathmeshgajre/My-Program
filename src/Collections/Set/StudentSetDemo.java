package Collections.Set;

import java.util.HashSet;

public class StudentSetDemo {
    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();

        set.add(new Student(1,"Prathm"));
        set.add(new Student(2,"Jhon"));
        set.add(new Student(3,"Nick"));

        for (Student s : set){
            System.out.println(s);
        }

    }
}

class Student{
    int id;
    String name;

    Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int hashCode(){
        return id;
    }

    public boolean equals(Object o){
        Student s = (Student) o;
        return this.id == s.id;
    }

    public String toString(){
        return id + " " + name;
    }


}
