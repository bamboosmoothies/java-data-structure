import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        /**
         * Queue = FIFO data structure. (First-in, first-out) (ex. A line of people)
         * A collectiond esigned for holding elements prior to processing
         * linear data structure.
         * dequeue (remove head) , offer()
         * enqueue (add tail) , remove()
         */

        // Cannot instantiate because queue is an interface; not a class.
        // Queue<String> queue = new Queue<String>()
        // So, in order to utilize the features of a queue, you must instantiate
        // LinkList or PriorityQueue

        Queue<String> queue = new LinkedList<String>();

        // System.out.println(queue.isEmpty());

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));
        // System.out.println(queue.peek());
        queue.poll();

        System.out.println(queue);

        // Where are queues useful?
        /**
         * 1. Keyboard Buffer (letters should appear on the screen in the order they're
         * pressed)
         * 2. Printer Queue (Print jobs should be completed in order)
         * 3. Used in LinkedLists, PriorityQueues, Breadth-first search algorithms
         */
    }
}
