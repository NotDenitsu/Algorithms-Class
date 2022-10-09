package THEME19.HOMEWORK;

import java.util.Arrays;
import java.util.Stack;

public class ArrayToStack {
    public static void main(String[] args) {
        int[] myARR = {11,22,33,44,55};
        System.out.println("Array elements: " + Arrays.toString(myARR));
        System.out.println("Adding all elements from the list to a stack!");

        Stack<Integer> stack = new Stack<Integer>();

        for (int element : myARR) {
            stack.push(element);
        }

        System.out.println("Stack elements: " + stack);
    }
}
