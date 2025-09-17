package array;

public class FindMaximumNumber {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50,60,70,80,90,100};

        int max = num[0]; //assume

        for(int i = 1; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println(max);

//==================================================================================

        int i = 1;
        while (i < num.length){
            if (num[i] > max){
                max = num[i];
            }
            i++;
        }
        System.out.println(max);
    }
}
