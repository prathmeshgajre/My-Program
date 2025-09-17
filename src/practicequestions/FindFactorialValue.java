package practicequestions;

import java.util.Scanner;

public class FindFactorialValue {

    public static void main(String[] args) {

        //Find factorial value of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        long factorial = 1;

        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
