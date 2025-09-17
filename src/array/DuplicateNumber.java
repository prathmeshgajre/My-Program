package array;

public class DuplicateNumber {

    public static void main(String[] args) {

        int[] arr = {10,20,40,60,70,90,30,50,80,100,30,60};

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){

                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
