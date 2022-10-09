package THEME17.CLASSWORK;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapCW {
    public static void main(String[] args) {

        int[] myARR = new Random().ints(20, 1, 11).toArray();

        System.out.println(Arrays.toString(myARR));
        System.out.println();

        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int i = 1; i <= 10; i++) {
            counter.put(i, 0);
        }

        for (int i = 0; i < myARR.length; i++) {
            int num = counter.get(myARR[i]);
            counter.put(myARR[i], num + 1);
        }

        for (Map.Entry<Integer, Integer> items : counter.entrySet()) {
            System.out.println("Element " + items.getKey() + " is encountered " + items.getValue() + " times!");
        }

    }
}
