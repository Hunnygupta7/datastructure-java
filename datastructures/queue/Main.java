package datastructures.queue;

public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        //Dequeue
        // (2) Items - Returns 2 Node
        System.out.println(myQueue.dequeue().value);
        // (1) Item - Returns 1 Node
        System.out.println(myQueue.dequeue().value);
        // (0) Items - Returns null
        System.out.println(myQueue.dequeue());

        // Enqueue
        // System.out.println("Before enqueue():");
        // System.out.println("--------------");
        // myQueue.getFirst();
        // myQueue.getLast();
        // myQueue.getLength();

        // System.out.println("\nQueue:");
        // myQueue.printQueue();

        // myQueue.enqueue(1);

        // System.out.println("\n\nAfter enqueue():");
        // System.out.println("-------------");
        // myQueue.getFirst();
        // myQueue.getLast();
        // myQueue.getLength();

        // System.out.println("\nQueue:");
        // myQueue.printQueue();

    }

}