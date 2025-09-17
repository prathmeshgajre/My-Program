package assignment1st;

import java.util.Scanner;

public class TrafficSignalSystem {
    public static void main(String[] args) {

        //Here we can use Switch Case Also
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Traffic Signal Color: ");
        String colour = sc.next();

        if (colour.equals("red"))
            System.out.println("Stop");
        else if (colour.equals("yellow"))
            System.out.println("Go slow");
        else if (colour.equals("green"))
            System.out.println("Go");
        else
            System.out.println("Invalid Color");
    }
}