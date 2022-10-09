package THEME11.CLASSWORK;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    static int[] myArray;
    public static void main(String[] args) {


        arrayFill();
        System.out.println("Before INSERTION SORT: " + Arrays.toString(myArray));

        insertionSort();
        System.out.println("After INSERTION SORT: " + Arrays.toString(myArray));

    }
    public static void arrayFill(){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter size of array: ");
        int n = input.nextInt();

        myArray = new int[n];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }
    }

    public static void insertionSort() {
        int n = myArray.length;
        for (int i = 1; i < n; i++) {
            int key = myArray[i];
            int j = i - 1;

            while (j >= 0 && myArray[j] > key) {
                myArray[j + 1] = myArray[j];
                j--;
            }
            myArray[j + 1] = key;
        }
    }
}
