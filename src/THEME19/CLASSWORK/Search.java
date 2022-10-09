package THEME19.CLASSWORK;

import java.util.Stack;

public class Search {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack elements: " + stack);

        System.out.println("Searching for 30!");
        System.out.println("Found 30 at position -> " + stack.search(30));
        System.out.println("Searching for  10!");
        System.out.println("Found 10 at position -> " + stack.search(10));
        System.out.println("Searching for 20!");
        System.out.println("Found 20 at position -> " + stack.search(20));
    }
}
