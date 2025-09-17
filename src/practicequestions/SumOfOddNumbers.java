package practicequestions;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        //Sum of Odd numbers 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num ; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
