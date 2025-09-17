package controlflowstatement;

public class IfElseLadder {
    public static void main(String[] args) {

        int a = 100;
        int b = 200;
        int c = 300;

        if (a > b && a > c){
            System.out.println("A is greater value");
        } else if (b > a && b > c) {
            System.out.println("B is greater value");

        } else {
            System.out.println("C is greater value");
        }
    }
}
