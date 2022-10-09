package THEME20.CLASSWORK;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        //add method
        System.out.println("Elements in queue: " + queue);
        System.out.println("Adding elements to the queue!");
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(14);
        System.out.println("Elements in queue: " + queue);
        System.out.println();

        //peek method
        System.out.println("Returning the head of the queue without removing it using PEEK: " + queue.peek());
        System.out.println("Elements in queue: " + queue);

        //element method
        System.out.println("Returning the head of the queue without removing it using ELEMENT: " + queue.element());
        System.out.println("Elements in queue: " + queue);
        //remove method
        System.out.println("Removing the head of the queue and returning it using REMOVE: " + queue.remove());
        System.out.println("Elements in queue: " + queue);

        //poll method
        System.out.println("Removing the head of the queue and returning it using POLL: " + queue.poll());
        System.out.println("Elements in queue: " + queue);

        //offer method
        int element = 17;
        System.out.println("Inserting a new element into the queue without violating the capacity: " + element);
        queue.offer(element);
        System.out.println("Elements in queue: " + queue);

        //size method
        System.out.println("Returning the size of the queue: " + queue.size());

        //clear method
        System.out.println("Clearing the queue!");
        queue.clear();

        //isEmpty method
        System.out.println("Checking if the queue is empty: " + queue.isEmpty());

    }
}
