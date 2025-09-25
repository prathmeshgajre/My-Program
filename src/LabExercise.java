import java.util.Scanner;
public class LabExercise {

    static void main() {
        //Write program using do-while statement in different way?
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        do {
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println("The sum of the entered numbers is: " + sum);
    }
}