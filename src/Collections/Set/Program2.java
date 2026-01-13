package Collections.Set;

import java.util.Scanner;
import java.util.TreeSet;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       TreeSet<Integer> ts = new TreeSet<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter the number: ");
            Integer num = sc.nextInt();
            ts.add(num);
        }
        System.out.println(ts);
    }
}