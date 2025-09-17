package practicequestions;

import java.util.Scanner;

public class PrintASCIIValue {
    public static void main(String[] args) {

        //Print ASCII value
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch;

        System.out.println(ascii);
    }
}
