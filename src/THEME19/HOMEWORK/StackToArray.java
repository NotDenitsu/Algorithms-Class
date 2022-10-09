package THEME19.HOMEWORK;

import java.util.Arrays;
import java.util.Stack;

public class StackToArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(13);
        stack.push(17);
        stack.push(28);
        stack.push(35);
        System.out.println("Stack elements: " + stack);
        System.out.println("Adding all elements from the stack to an array!");

        int[] myARR = new int[stack.size()];

        int i = 0;
        for (int element : stack) {
            myARR[i] = element;
            i++;
        }

        System.out.println("Array elements: " + Arrays.toString(myARR));
    }
}
