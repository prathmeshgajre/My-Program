package Collections.Set;

import java.util.Scanner;
import java.util.TreeSet;

public class Employee {

    String name;
    int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return name + " " + salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Employee> employee = new TreeSet<>((e1,e2)-> e2.salary - e1.salary);

        System.out.print("Enter number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details of employee: ");

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Salary: ");
            int salary = sc.nextInt();
            sc.nextLine();

            employee.add(new Employee(name + " :" , salary));
            
        }
        System.out.println("\n");

        /*employee.add(new Employee("Jhon",50000));
        employee.add(new Employee("Prathm",150000));
        employee.add(new Employee("Ram",75000));*/

         for (Employee e : employee){
             System.out.println(e);
         }

    }

}
