package THEME20.HOMEWORK;

public class MyQueue {
    private static int front, back, size;
    private static int[] queue;

    MyQueue (int capacity) {
        front = back = 0;
        size = capacity;
        queue = new int[size];
    }

    MyQueue () {
        front = back = 0;
        size = 11;
        queue = new int[size];
    }

    void qAdd (int element) {
        if(back == size){
            System.out.println("The queue is full!");
        } else {
            queue[back] = element;
            back++;
        }
    }

    int qPeek(){
        return queue[front];
    }

    int qPoll(){
        int frontElement = queue[front];
        if(front == back){
            System.out.println("The queue is empty!");
        } else {
            for (int i = 0; i < back - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if(back < size) {
                queue[back] = 0;
                back--;
            }
        }
        return frontElement;
    }

    int qSize(){
        return back;
    }

    boolean qIsEmpty(){
        return front == back;
    }

    String qPrint(){
        String displayQueue = "[";
        for (int i = 0; i < back; i++) {
            displayQueue += (i == back - 1) ? queue[i] + "]" : queue[i] + ",";
        }
        return displayQueue;
    }

}
