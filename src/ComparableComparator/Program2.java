package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        List<Employee1> list = new ArrayList<>();

        list.add(new Employee1(103,"Dinesh","Srirame",75000));
        list.add(new Employee1(101,"Prathm","Gajre",99000));
        list.add(new Employee1(104,"Bharat","Karle",55000));
        list.add(new Employee1(107,"Rajesh","Paranjpe",65000));
        list.add(new Employee1(102,"Sumit","Shinde",52500));
        list.add(new Employee1(105,"Rushi","Chepte",74000));
        list.add(new Employee1(109,"Ajay","Magar",40000));
        list.add(new Employee1(106,"Ajit","Birajdar",45000));
        list.add(new Employee1(110,"Narsing","Patil",92500));
        list.add(new Employee1(108,"Manish","Bhavsar",86000));

        Collections.sort(list, new SortById());
        System.out.println("Sort by Id: ");
        list.forEach(System.out::println);
    }
}

class SortById implements Comparator<Employee1>{
    @Override
    public int compare(Employee1 e1, Employee1 e2) {
        return Integer.compare(e1.id,e2.id);
    }
}

class Employee1{
    int id;
    String fName;
    String lName;
    double salary;

    Employee1(int id, String fName, String lName, double salary){
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
