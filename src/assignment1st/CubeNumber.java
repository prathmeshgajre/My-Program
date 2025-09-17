package assignment1st;

import java.util.Scanner;

public class CubeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            int cube = i * i * i;
            System.out.println("Number is: "+ i +" and Cube is: " +cube);
        }
    }
}
