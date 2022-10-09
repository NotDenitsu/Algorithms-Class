package THEME16.CLASSWORK;

import java.util.Hashtable;
import java.util.Scanner;

public class DictionaryCW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hashtable<Integer,String> myDictionary = new Hashtable<>();


        myDictionary.put(1, "Monday");
        myDictionary.put(2, "Tuesday");
        myDictionary.put(3, "Wednesday");
        myDictionary.put(4, "Thursday");
        myDictionary.put(5, "Friday");
        myDictionary.put(6, "Saturday");
        myDictionary.put(7, "Sunday");

        System.out.println();
        System.out.println("Days of the week: " + myDictionary);
        System.out.println("Dictionary size: " + myDictionary.size());
        System.out.println();

        do {
            System.out.print("Enter a number in the range of 1 - 7: ");
            int n = input.nextInt();
            if(n > 0 && n < 7){
                System.out.println(myDictionary.get(n));
                break;
            } else {
                System.out.println("Out of range");
            }
        } while(true);


    }
}
