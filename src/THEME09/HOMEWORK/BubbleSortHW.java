package THEME09.HOMEWORK;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSortHW {
    static int[] myArray;
    static int evenArray[];
    static int oddArray[];
    static int evenSize = 0;
    static int oddSize = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        myArray = new int[n];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            if(myArray[i] % 2 == 0){
                evenSize++;
            }else {
                oddSize++;
            }
        }

        System.out.println("Main array: " + Arrays.toString(myArray));
        evenArray = new int[evenSize];
        oddArray = new int[oddSize];
        evenSize = 0;
        oddSize = 0;

        separation();
        System.out.println("Unsorted EVEN array: " + Arrays.toString(evenArray));
        System.out.println("Unsorted ODD array: " + Arrays.toString(oddArray));


        evenSortAscending();
        oddSortDescending();
        System.out.println("Sorted in ascending order EVEN array: " + Arrays.toString(evenArray));
        System.out.println("Sorted in descending order ODD array: " + Arrays.toString(oddArray));



    }

    public static void separation(){
        for (int a : myArray) {
            if(a % 2 == 0){
                evenArray[evenSize] = a;
                evenSize++;
            } else {
                oddArray[oddSize] = a;
                oddSize++;
            }
        }
    }
    public static void evenSortAscending(){
        for (int i = 0; i < evenArray.length - 1; i++) {
            for (int j = 0; j < evenArray.length - i - 1; j++) {
                if(evenArray[j] > evenArray[j + 1]){
                    int tmp = evenArray[j];
                    evenArray[j] = evenArray[j + 1];
                    evenArray[j + 1] = tmp;
                }
            }
        }
    }
    public static void oddSortDescending(){
        for (int i = 0; i < oddArray.length - 1; i++) {
            for (int j = 0; j < oddArray.length - i - 1; j++) {
                if(oddArray[j] < oddArray[j + 1]){
                    int tmp = oddArray[j];
                    oddArray[j] = oddArray[j + 1];
                    oddArray[j + 1] = tmp;
                }
            }
        }
    }
}
