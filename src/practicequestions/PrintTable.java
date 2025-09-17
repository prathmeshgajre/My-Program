package practicequestions;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {

        //Print table
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i) );
        }
    }
}
