package THEME08.CLASSWORK;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int[] myArr = new int[30];
        byte[] Taken = new byte[30];
        int numberOfInteractions = 0;
        int count = 0;
        int M = 0;
        boolean isRunning = true;

        System.out.print("Please type the number you're looking for M : ");
        M = input.nextInt();

        for (int i = 0; i < myArr.length - 1; i++) {
            myArr[i] = random.nextInt(100);
        }

        while(isRunning){
            numberOfInteractions++;

            int i = random.nextInt(25);
            if(myArr[i] == M){
                System.out.println("The number you are looking for has been found in index " + i);
                Taken[i] = 1;
                break;
            }else {
                Taken[i] = 1;
                count = 0;

                for (byte b : Taken) {
                    if (b == 1){
                        count++;
                    }
                }
                if(count == 25){
                    isRunning = false;
                    System.out.println("No matching number");
                }
            }
        }

        System.out.println("Number of interactions checked: " + numberOfInteractions);

        count = 0;
        for (byte b : Taken) {
            if(b == 1){
                count++;
            }
        }

        System.out.println("Number of indexes checked: " + count);
        System.out.println("My array     : " + Arrays.toString(myArr));
        System.out.println("Binary array : " + Arrays.toString(Taken));
    }
}
