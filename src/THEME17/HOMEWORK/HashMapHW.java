package THEME17.HOMEWORK;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapHW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String,String> catalog = new HashMap<>();

        catalog.put("Whatever It Takes","Imagine Dragons");
        catalog.put("Enemy", "Imagine Dragons");
        catalog.put("Middle Of The Night", "Elley Duhe");
        catalog.put("Numb Little Bug", "Em Beihold");
        catalog.put("Mayday","TheFatRat");
        catalog.put("The Storm","TheFatRat");
        catalog.put("The Calling", "TheFatRat");

        System.out.println();
        System.out.println("For a band type 1");
        System.out.println("For a song type 2");
        int choice = Integer.parseInt(input.nextLine());

        while(!(choice == 1 || choice == 2)){
            System.out.println("Make a valid choice! Enter 1 or 2");
            choice = Integer.parseInt(input.nextLine());
        }

        if(choice == 1){

            System.out.println("Enter a band name!");
            String band = input.nextLine();
            System.out.println();

            if(catalog.containsValue(band)){
                catalog.forEach((key, value) -> {
                    if(value.equals(band)){
                        System.out.println("For the band " + band + " is found the song " + key);
                    }
                });
            }
        } else {

            System.out.println("Enter a song name!");
            String song = input.nextLine();
            System.out.println();

            if(catalog.containsKey(song)){
                System.out.println("The song " + song + " belongs to " + catalog.get(song));
            }

        }


    }
}
