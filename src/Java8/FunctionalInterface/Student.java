package Java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Student {
    int id;
    String name;
    double percentage;
    String specialization;

    public Student(int id, String name, double percentage, String specialization) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.specialization = specialization;
    }
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPercentage(){
        return percentage;
    }
    public String getSpecialization(){
        return specialization;
    }
    @Override
    public String toString(){
        return id + "-" + name + "-" + percentage + "-" + specialization;
    }


    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"Jhon",81.0,"Mathematic"));
        list.add(new Student(2,"Harsha",79.5,"History"));
        list.add(new Student(3,"Ruth",87.2,"Computers"));
        list.add(new Student(4,"Aroma",63.2,"Mathematic"));
        list.add(new Student(5,"Zade",83.5,"Computers"));
        list.add(new Student(6,"Xing",58.5,"Geography"));
        list.add(new Student(7,"Richards",72.6,"Banking"));
        list.add(new Student(8,"Sunil",86.7,"History"));
        list.add(new Student(9,"Jordan",58.6,"Finance"));
        list.add(new Student(10,"Chris",89.8,"Computers"));

        Predicate<Student> mathematicsPredicate = (Student student) -> student.specialization.equals("Mathematic");
        List<Student> mathematicsStudents = new ArrayList<Student>();

        for (Student student : list) {
            if (mathematicsPredicate.test(student)){
                mathematicsStudents.add(student);
            }
        }

        Consumer<Student> percentageConsumer = (Student student) -> {
            System.out.println(student.getName()+ " : " + student.getPercentage());
        };
        for (Student student : list) {
            percentageConsumer.accept(student);
        }


    }

}
