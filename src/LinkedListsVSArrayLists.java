import java.util.ArrayList;
import java.util.LinkedList;

/**
 * LinkedListsVSArrayLists
 */
public class LinkedListsVSArrayLists {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 10000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        /* LinkedList */

        startTime = System.nanoTime();

        linkedList.get(0);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + " ns");

        /* ArrayList */

        startTime = System.nanoTime();

        arrayList.get(0);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + " ns");

        /**
         * LinkedList is hella slow compare to ArrayList.
         * Exception: LinkedList is the fastest when searching for the last element from
         * the last index of a list.
         */
    }
}