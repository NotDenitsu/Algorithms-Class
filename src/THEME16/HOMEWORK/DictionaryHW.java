package THEME16.HOMEWORK;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class DictionaryHW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hashtable<Integer,String> myDictionary = new Hashtable<>();


        myDictionary.put(1, "January");
        myDictionary.put(2, "February");
        myDictionary.put(3, "March");
        myDictionary.put(4, "April");
        myDictionary.put(5, "May");
        myDictionary.put(6, "June");
        myDictionary.put(7, "July");
        myDictionary.put(8, "August");
        myDictionary.put(9, "September");
        myDictionary.put(10, "October");
        myDictionary.put(11, "November");
        myDictionary.put(12, "December");

        System.out.println();
        System.out.println("Days of the week: " + myDictionary);
        System.out.println("Dictionary size: " + myDictionary.size());
        System.out.println();

        System.out.println("Enter [1] if you want to search a VALUE by it's KEY.");
        System.out.println("Enter [2] if you want to search a KEY by it's VALUE.");
        int choice = Integer.parseInt(input.nextLine());

        if(choice == 1) {
            Enumeration<Integer> itemKeys = myDictionary.keys();
            Enumeration<String> itemValues = myDictionary.elements();

            System.out.println("Enter the number of the month");
            String monthNumber = input.nextLine();

            while(itemKeys.hasMoreElements()){
                String currentKey = itemKeys.nextElement().toString();
                String currentValue = itemValues.nextElement();

                if(currentKey.equals(monthNumber)){
                    System.out.println(currentValue);
                }
            }


        }
        if(choice == 2) {
            Enumeration<Integer> itemKeys = myDictionary.keys();
            Enumeration<String> itemValues = myDictionary.elements();

            System.out.println("Enter the name of the month");
            String monthName = input.nextLine();

            while(itemKeys.hasMoreElements()){
                String currentKey = itemKeys.nextElement().toString();
                String currentValue = itemValues.nextElement();

                if(currentValue.equals(monthName)){
                    System.out.println(currentKey);
                }
            }


        }



    }
}
