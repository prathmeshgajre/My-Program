package array;

public class CountEvenOrOdd {
    public static void main(String[] args) {

        int[] number = {10,53,29,86,74,97,40};

        int evenNum = 0;
        int oddNum = 0;

        for(int i=0; i < number.length; i++){
            if (number[i] % 2 == 0){
                evenNum++;
            }else {
                oddNum++;
            }
        }
        System.out.println(evenNum);
        System.out.println(oddNum);

//==================================================================================
        int i=0;

        while (i < number.length){
            if (number[i] % 2 == 0){
                evenNum++;
            }else {
                oddNum++;
            }
            i++;
        }
        System.out.println(evenNum);
        System.out.println(oddNum);
    }
}
