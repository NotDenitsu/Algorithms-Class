package THEME10.CLASSWORK;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
    static int[] myArray;
    public static void main(String[] args) {


        arrayFill();
        System.out.println("Before SELECTION SORT: " + Arrays.toString(myArray));

        selectionSort();
        System.out.println("After SELECTION SORT: " + Arrays.toString(myArray));

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

    public static void selectionSort() {
        int n = myArray.length;

        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (myArray[j] < myArray[min_index]) {
                    min_index = j;
                }
            }

            int tmp = myArray[min_index];
            myArray[min_index] = myArray[i];
            myArray[i] = tmp;
        }
    }

}
