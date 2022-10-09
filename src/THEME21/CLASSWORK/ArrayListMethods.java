package THEME21.CLASSWORK;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {
        ArrayList<String> myAL = new ArrayList<String>();
        System.out.println("----------Adding Elements----------");
        myAL.add(0,"MONDAY");
        myAL.add(1,"TUESDAY");
        myAL.add(2,"WEDNESDAY");
        myAL.add(3,"THURSDAY");
        myAL.add(4,"FRIDAY");
        myAL.add(5,"SATURDAY");
        myAL.add(6,"SUNDAY");
        System.out.println(myAL.toString());
        System.out.println("-----------------------------------");
        System.out.println();

        System.out.println("----------Getting Element----------");
        System.out.println("Getting the 3rd day of the week: " + myAL.get(2));
        System.out.println("-----------------------------------");
        System.out.println();


        System.out.println("----------Removing Elements----------");
        System.out.println("Removing the 1st day of the week by INDEX...");
        myAL.remove(0);
        System.out.println(myAL.toString());

        System.out.println("Removing 2nd day of the week by VALUE...");
        myAL.remove("TUESDAY");
        System.out.println(myAL.toString());
        System.out.println("-----------------------------------");
        System.out.println();


        System.out.println("----------Setting Element----------");
        System.out.println("Setting WEDNESDAY to MONDAY...");
        myAL.set(0,"MONDAY");
        System.out.println(myAL.toString());
        System.out.println("-----------------------------------");
        System.out.println();

        System.out.println("----------Iterations----------");
        System.out.print("Printing the ArrayList using FOR EACH: ");
        printForEach(myAL);
        System.out.print("Printing the ArrayList using FOR: ");
        printFor(myAL);
        System.out.print("Printing the ArrayList using Lambda: ");
        printLambda(myAL);
        System.out.println("-----------------------------------");
        System.out.println();

        System.out.println("----------Returning Properties----------");
        System.out.println("Getting the size of the ArrayList: " + myAL.size());
        System.out.println("Checking if the ArrayList is empty: " + myAL.isEmpty());
        System.out.println("-----------------------------------");



    }

    public static void printForEach(ArrayList<String> arrayList){
        System.out.print("[");

        for (String dayOfWeek : arrayList) {
            System.out.print((arrayList.indexOf(dayOfWeek) != arrayList.size() - 1) ? dayOfWeek + "," : dayOfWeek);
        }
        System.out.println("]");
    }

    public static void printFor(ArrayList<String> arrayList){
        System.out.print("[");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print((i + 1 == arrayList.size()) ? arrayList.get(i) : arrayList.get(i) + ",");
        }
        System.out.println("]");
    }

    public static void printLambda(ArrayList<String> arrayList){
        System.out.print("[");
        arrayList.stream().forEach((day) -> {
            System.out.print((arrayList.indexOf(day) != arrayList.size() - 1) ? day + "," : day);
        });
        System.out.println("]");
    }
}
