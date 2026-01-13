package Collections.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Set<String> cityNames = new HashSet<>();

        while (true){
            System.out.println("Enter city name (type 'exit' to stop): ");
            String city = sc.next();

            if (city.equalsIgnoreCase("exit")){
                break;
            }

            city = city.trim().toLowerCase();

            cityNames.add(city);
        }

        System.out.println("\nUnique Cities Entered:");
        for (String c : cityNames){
            System.out.println(c);
        }
    }
}