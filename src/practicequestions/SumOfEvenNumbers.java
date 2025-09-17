package practicequestions;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Sum of even numbers 1 to n
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 2; i <= num ; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
