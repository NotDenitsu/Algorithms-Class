package THEME09.CLASSWORK;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSortCW {
    static int[] myArray;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        myArray = new int[n];

        mixArray(); // Разбъркваме масива с нови числа
        System.out.println("Before FOR Bubble Sort: " + Arrays.toString(myArray));
        bubbleSortFor(); // Сортираме с FOR
        System.out.println("After FOR Bubble Sort: " + Arrays.toString(myArray));

        mixArray(); // Разбъркваме масива с нови числа
        System.out.println("Before DO WHILE Bubble Sort: " + Arrays.toString(myArray));
        bubbleSortDoWhile(); // Сортираме с DO WHILE
        System.out.println("After DO WHILE Bubble Sort: " + Arrays.toString(myArray));


    }

    //Метод за разбъркване
    public static void mixArray(){
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }
    }
    public static void bubbleSortFor(){
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 0; j < myArray.length - i - 1; j++) {
                if(myArray[j] > myArray[j + 1]){
                    int tmp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = tmp;
                }
            }
        }
    }

    public static void bubbleSortDoWhile(){
        int n = myArray.length - 1;
        boolean swapped = false;
        do{
            swapped = false;
            n--;

            for (int i = 0; i <= n; i++) {
                if(myArray[i] > myArray[i + 1]){
                    int tmp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = tmp;

                    swapped = true;
                }
            }

        } while (swapped);
    }
}
