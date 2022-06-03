import java.util.*;

public class WorkingWithPriorityQueue {
    public static void main(String[] args) {
        /**
         * Priority Queue = A FIFO data structure that serves elements
         * with the highest priorities first
         * before elements with lower priority
         */

        Queue<Double> queue = new PriorityQueue<>();
        // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        // descending order

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
            // default arrangement in ascending order
        }

        Queue<String> grades = new PriorityQueue<>();
        grades.offer("B");
        grades.offer("C");
        grades.offer("A");
        grades.offer("F");
        grades.offer("D");

        while (!grades.isEmpty()) {
            System.out.println(grades.poll());
            // default arrangement in ascending order
        }

    }
}
