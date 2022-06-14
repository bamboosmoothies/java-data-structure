import java.util.LinkedList;

/**
 * WorkingWithLinkedList
 */
public class WorkingWithLinkedList {

    public static void main(String[] args) {

        /**
         * LinkedList = stores Nodes in 2 parts (data + address)
         * Nodes are in non-consecutive memory locations
         * Elements are linked using pointers
         * 
         * advantages?
         * 1. Dynamic Data STructure (allocates needed memory while running)
         * 2. Insertion and DEletion of Nodes is easy. 0(1)
         * 3. No/Low memory waste.
         * 
         * 
         */

        LinkedList<String> linkedList = new LinkedList<String>();

        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");
        // linkedList.pop();

        /*
         * LinkedList as a Queue
         */
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll();

        linkedList.add(4, "E");
        linkedList.remove("E");
        // System.out.println(linkedList.indexOf("f"));

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("G");

        // System.out.println(linkedList);
    }
}