package patterns;

public class HollowSquare {
    static void main() {

        //int n = 6;
        printPattern(5);
        printPattern(6);
        printPattern(7);
    }

    public static void printPattern(int n){

        for (int i = 0; i < n; i++){

            for (int j = 0; j < n; j++){

                if (i == 0 || j == 0 || i == n - 1 || j == n - 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
