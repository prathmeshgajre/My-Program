package practicequestions;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        //Sum of all natural numbers 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
