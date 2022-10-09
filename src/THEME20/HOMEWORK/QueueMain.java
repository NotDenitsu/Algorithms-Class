package THEME20.HOMEWORK;

public class QueueMain {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(11);
        System.out.println("Adding elements to the queue...");
        queue.qAdd(11);
        queue.qAdd(12);
        queue.qAdd(16);
        System.out.println("Displaying the queue: " + queue.qPrint());
        System.out.println("Displaying the amount of elements in the queue: " + queue.qSize());
        System.out.println("Removing and returning the front element of the queue: " + queue.qPoll());
        System.out.println("Displaying the queue: " + queue.qPrint());
        System.out.println("Checking if the queue is empty: " + queue.qIsEmpty());
        System.out.println("Returning the front element of the queue without removing it: " + queue.qPeek());
        System.out.println("Displaying the queue: " + queue.qPrint());
    }
}
