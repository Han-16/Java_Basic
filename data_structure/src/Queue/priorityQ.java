package Queue;

import java.util.PriorityQueue;

public class priorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> prQ = new PriorityQueue<>();
        System.out.println(prQ.toString());

        prQ.add(3);
        prQ.add(5);
        prQ.add(1);
        prQ.add(10);
        System.out.println(prQ.toString());

        int temp = prQ.peek();
        System.out.println(temp);

        int poll = prQ.poll();
        System.out.println(temp);
        System.out.println(poll + "\n");

        while (!prQ.isEmpty()) {
            System.out.println(prQ.poll());
        }
    }
}
