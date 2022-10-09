package THEME19.CLASSWORK;

import java.util.Stack;

public class Peek {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack elements: " + stack);
        System.out.println("The element on top is: " + stack.peek());
        System.out.println("Stack elements: " + stack);
    }
}
