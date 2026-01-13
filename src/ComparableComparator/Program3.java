package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {

        List<Employee2> list = new ArrayList<>();

        list.add(new Employee2(103,"Dinesh","Srirame",75000));
        list.add(new Employee2(101,"Prathm","Gajre",99000));
        list.add(new Employee2(104,"Bharat","Karle",55000));
        list.add(new Employee2(107,"Rajesh","Paranjpe",65000));
        list.add(new Employee2(102,"Sumit","Shinde",52500));
        list.add(new Employee2(105,"Rushi","Chepte",74000));
        list.add(new Employee2(109,"Ajay","Magar",40000));
        list.add(new Employee2(106,"Ajit","Birajdar",45000));
        list.add(new Employee2(110,"Narsing","Patil",92500));
        list.add(new Employee2(108,"Manish","Bhavsar",86000));

        Collections.sort(list,new SortByFirstName());
        System.out.println("Sort by Id: ");
        list.forEach(System.out::println);

    }
}


class SortByFirstName implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 e1, Employee2 e2) {
        return e1.fName.compareTo(e2.fName);
    }
}

class Employee2{
    int id;
    String fName;
    String lName;
    double salary;

    Employee2(int id, String fName, String lName, double salary){
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
