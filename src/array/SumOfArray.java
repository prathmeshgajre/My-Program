package array;

public class SumOfArray {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        int totalSum = 0;

        for(int i=0; i < arr.length; i++){
            totalSum += arr[i];
        }
        System.out.println(totalSum);

//==================================================================================

        int i = 0;
        while (i < arr.length) {
            totalSum += arr[i];
            i++;
        }
        System.out.println(totalSum);
    }
}
