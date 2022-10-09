package THEME07.HOMEWORK;

import java.util.Scanner;

public class CoinNominal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] coins = {50,20,10,5,2,1};
        int coinCount = 0;
        int index = 0;
        double total = input.nextDouble() * 100;
        System.out.println("Entered sum in coins is: " + (int) total);

        while(total > 0){
            if(total - coins[index] >= 0){
                total -= coins[index];
                coinCount++;
                System.out.println("Coin " + coinCount + " has a nominal of " + coins[index]);
                System.out.println("Remaining sum in coins: " + total);
            } else {
                index++;
                if(index > coins.length - 1){
                    System.out.println();
                    System.out.println("You do not have enough coin types. The remaining sum is: " + total);
                }
            }
        }
        System.out.println("Total amount of coins used: " + coinCount);
    }
}
