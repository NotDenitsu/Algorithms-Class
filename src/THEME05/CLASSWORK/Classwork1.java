package THEME05.CLASSWORK;

import java.util.Scanner;

public class Classwork1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Въведе размер на масива: ");
        int n = input.nextInt();
        System.out.println();
        int myArr[] = new int[n];
        int currentMax = Integer.MIN_VALUE;


        for (int i = 0; i <= n-1; i++) {
            System.out.printf("Въведете елемент - %d на масива: ", i);
            int number = input.nextInt();
            myArr[i] = number;

            if(myArr[i] > currentMax){
                currentMax = myArr[i];
            }
            System.out.println();
        }

        System.out.println("Най-голямата стойност в масива е: " + currentMax);
    }
}
