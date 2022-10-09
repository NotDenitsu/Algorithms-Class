package THEME19.HOMEWORK;

import java.util.ArrayList;
import java.util.Stack;

public class ArrayListToStack {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("List elements: " + list);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Adding all elements from the list to a stack!");

        for (int element : list) {
            stack.push(element);
        }

        System.out.println("Stack elements: " + stack);

    }
}
