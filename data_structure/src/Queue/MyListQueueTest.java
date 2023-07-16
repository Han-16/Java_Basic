package Queue;

public class MyListQueueTest {
    public static void main(String[] args) {
        MyListQueue Queue = new MyListQueue();
        Queue.enQueue("A");
        Queue.enQueue("B");
        Queue.enQueue("C");
        Queue.enQueue("D");
        Queue.enQueue("E");

        System.out.println(Queue.deQueue());
        Queue.printAll();
    }
}
