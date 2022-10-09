package THEME20.CLASSWORK;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueIterationCW {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(13);
        queue.add(17);
        queue.add(23);
        queue.add(83);
        System.out.println("Queue elements: " + queue);
        System.out.println();

        //using iterator
        System.out.println("Iterating through the queue and printing all elements using ITERATOR!");
        Iterator iterator = queue.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();

        //using foreach
        System.out.println("Iterating through the queue and printing all elements using FOREACH!");
        for (int element : queue) {
            System.out.print(element + ", ");
        }
        System.out.println();

        //using stream
        System.out.println("Iterating through the queue and printing all elements using STREAM");
        queue.stream().forEach(element -> System.out.print(element + ", "));
        System.out.println();
    }
}
