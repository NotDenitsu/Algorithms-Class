package THEME12.HOMEWORK;

import java.util.Random;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int CPUNumber = rand.nextInt(1000);
        int userNumber = 0;
        int low = 1;
        int high = 1000;

        while(userNumber != CPUNumber){
            System.out.print("Enter number: ");
            userNumber = input.nextInt();

            if(userNumber < CPUNumber){

                System.out.println("HIGHER!");
                low = Math.max(low,userNumber);
                System.out.println("LOW: " + low + " | " + "HIGH: " + high);

            } else if (userNumber > CPUNumber){

                System.out.println("LOWER!");
                high = Math.min(high,userNumber);
                System.out.println("LOW: " + low + " | " + "HIGH: " + high);

            } else {
                System.out.println("CORRECT!");
            }
        }
    }
}
