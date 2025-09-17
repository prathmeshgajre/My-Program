   package array;

public class SumOfAverageNumbers {
    public static void main(String[] args) {

        int[] num = new int[6];

        num[0] = 10;
        num[1] = 50;
        num[2] = 70;
        num[3] = 80;
        num[4] = 60;
        num[5] = 20;

        double avg = 0.0;
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        avg = (double) sum / num.length;

            System.out.println(sum);
            System.out.println(avg);


    }
}
