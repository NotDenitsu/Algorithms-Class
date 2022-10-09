package THEME19.CLASSWORK;

import java.util.Stack;

public class Iteration {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Printing all elements in the stack!");
        for (int element : stack) {
            System.out.println(element);
        }
    }
}
