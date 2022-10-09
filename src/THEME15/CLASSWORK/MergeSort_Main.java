package THEME15.CLASSWORK;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort_Main {

    public static void main(String[] args) {

        System.out.print("Enter array size: ");
        int n = new Scanner(System.in).nextInt();

        int[]myArr = new Random().ints(n, 1, 50).toArray();

        System.out.println("Array BEFORE sorting: " + Arrays.toString(myArr));

        MergeSort_Methods.sort(myArr, 0 , myArr.length - 1);

        System.out.println("Array AFTER sorting: " + Arrays.toString(myArr));
    }
}
