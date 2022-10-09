package THEME05.CLASSWORK;

import java.util.Scanner;

public class Classwork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Въведе размер на масива: ");

        int n = input.nextInt();
        System.out.println();
        int myArr[] = new int[n];

        for (int i = 0; i <= n-1; i++) {
            System.out.printf("Въведете елемент - %d на масива: ", i);
            myArr[i] = input.nextInt();
        }


        int currentMax = myArr[0];
        for (int i = 1; i <= n - 1; i++) {
            if(myArr[i] > currentMax){
                currentMax = myArr[i];
            }
        }

        System.out.println("Най-голямата стойност в масива е: " + currentMax);
    }
}
