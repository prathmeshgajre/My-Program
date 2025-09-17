package array;

public class AscendingOrder {
    public static void main(String[] args) {

        int[] arr = {10,30,50,70,90,20,40,60,80,100};
        int temp;

        /*for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

//==================================================================================

        int i = 0;
        int j = 0;
        while (i < arr.length){
            while (j < arr.length){
                if (arr[i] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    j++;

                }
            }
            i++;
        }
        while (i < arr.length){
            System.out.println(arr[i]);
            i++;
        }

    }
}
