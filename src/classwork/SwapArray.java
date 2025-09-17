package classwork;

public class SwapArray {
    public static void main(String[] args) {

        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8};
        int temp;

        for(int i = 0; i < a.length; i++){
            temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }

        for(int i : a)
            System.out.print(i + " ");
        System.out.println();
        for(int i : b)
            System.out.print(i + " ");
        System.out.println();

        System.out.println("--------------------");

        int[] c = {1,2,3,4};
        int[] d = {5,6,7,8};

        for (int i = 0; i < c.length; i++){
            c[i] = c[i] + d[i];
            d[i] = c[i] - d[i];
            c[i] = c[i] - d[i];
        }

        for(int i : c)
            System.out.print(i + " ");
        System.out.println();
        for(int i : d)
            System.out.print(i + " ");
    }
}
