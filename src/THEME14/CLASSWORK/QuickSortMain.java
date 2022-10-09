package THEME14.CLASSWORK;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSortMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QuickSortMethods sort = new QuickSortMethods();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[]myArr = new Random().ints(n, 1, 50).toArray();

        System.out.println("Array BEFORE sorting:");
        System.out.println(Arrays.toString(myArr));

        sort.QuickSort( myArr, 0 , myArr.length-1);

        System.out.println("Array AFTER sorting:");
        System.out.println(Arrays.toString(myArr));

    }
}
