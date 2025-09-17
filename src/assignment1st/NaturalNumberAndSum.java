package assignment1st;

import java.util.Scanner;

public class NaturalNumberAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum of Natural Number up to " + num + " terms: " + sum);
    }
}
