package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(103,"Dinesh","Srirame",75000));
        employees.add(new Employee(101,"Prathm","Gajre",99000));
        employees.add(new Employee(104,"Bharat","Karle",55000));
        employees.add(new Employee(107,"Rajesh","Paranjpe",65000));
        employees.add(new Employee(102,"Sumit","Shinde",52500));
        employees.add(new Employee(105,"Rushi","Chepte",74000));
        employees.add(new Employee(109,"Ajay","Magar",40000));
        employees.add(new Employee(106,"Ajit","Birajdar",45000));
        employees.add(new Employee(110,"Narsing","Patil",92500));
        employees.add(new Employee(108,"Manish","Bhavsar",86000));

        Collections.sort(employees);

        System.out.println("Employee details sorted by Id: ");
        for (Employee e : employees){
            System.out.println(e);
        }

    }
}
class Employee implements Comparable<Employee>{

    int id;
    String fName;
    String lName;
    double salary;

    Employee(int id, String fName, String lName, double salary){
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e) {
         return Integer.compare(this.id, e.id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", salary=" + salary +
                '}';
    }
}