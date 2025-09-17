package array;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        //Copy array using loop

        int[] originalArray = {2,3,4,5,6,7};

        int[] newArray = new int[originalArray.length];

        for(int i = 0; i < originalArray.length; i++)
            newArray[i] = originalArray[i];

        System.out.println("Elements of originalArray[]: ");
        for(int i = 0; i < originalArray.length; i++)
            System.out.print(originalArray[i] + " ");

        System.out.println("\nElements of newArray[]: ");
        for (int i = 0; i < newArray.length; i++)
            System.out.print(newArray[i] + " ");

        System.out.println("\n");
        //Using System.arraycopy() Method

        char[] sourceArray = {'P','R','A','T','H','M'};

        char[] targetArray = new char[sourceArray.length];

        System.arraycopy(sourceArray,0,targetArray,0,6);

        System.out.println("Elements of sourceArray[]: ");
        for(int i = 0; i < sourceArray.length; i++)
            System.out.print(sourceArray[i] + " ");

        System.out.println("\nElements of targetArray[]: ");
        for(int i = 0; i < targetArray.length; i++)
            System.out.print(targetArray[i] + " ");

        System.out.println("\n");
        //Using clone() method to Copy Array

        char[] oArray = {'P','R','A','T','H','M'};

        char[] nArray = oArray.clone();

        System.out.println("Elements of oArray[]: ");
        for (int i = 0; i < oArray.length; i++)
            System.out.print(oArray[i] + " ");

        System.out.println("\nElements of nArray[]: ");
        for (int i = 0; i < nArray.length; i++)
            System.out.print(nArray[i] + " ");

        System.out.println("\n");
        //Using copyOf() Method of java.util.Arrays Class:

        String[] oArray1 = {"John","Smith","Nick","Rio"};

        String[] nArray1 = Arrays.copyOf(oArray1,oArray1.length);
        System.out.println("Elements of oArray[]: ");
        for(int i = 0; i < oArray1.length; i++)
            System.out.print(oArray1[i] + " ");

        System.out.println("\nElements of nArray[]: ");
        for (int i = 0; i < nArray1.length; i++)
            System.out.print(nArray1[i] + " ");

        System.out.println("\n");
        //Using copyOfRange Method of Arrays Class:

        int[] oArray2 = {1,2,3,4,5,6,7,8,9,10};

        int[] nArray2 = Arrays.copyOfRange(oArray2,1,8);

        System.out.println("Elements of oArray[]: ");
        for (int i = 0; i < oArray2.length; i++)
            System.out.print(oArray2[i] + " ");

        System.out.println("\nElements of nArray[]: ");
        for (int i = 0; i < nArray2.length; i++)
            System.out.print(nArray2[i] + " ");

    }
}