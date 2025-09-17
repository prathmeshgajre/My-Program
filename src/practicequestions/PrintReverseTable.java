package practicequestions;

import java.util.Scanner;

public class PrintReverseTable {
    public static void main(String[] args) {

        //Print Reverse table
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 10; i >=1; i--){
            System.out.println(num + " x " + i + " = " + (num * i) );
        }
    }
}
