import java.util.LinkedList;

/**
 * WorkingWithLinkedList
 */
public class WorkingWithLinkedList {

    public static void main(String[] args) {
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