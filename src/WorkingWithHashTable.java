import java.util.Hashtable;

public class WorkingWithHashTable {
    public static void main(String[] args) {
        /**
         * Hashtable = A data structure that stores unique keys to values ex.<Integer,
         * String>
         * Each key/value pair is known as an Entry
         * FAST insertion, look up, deletion of key/value pairs
         * Not ideal for small data sets, great with large data sets
         * 
         * hashing = takes a key and computes an integer (formula will vary based on key
         * and data type)
         * In a Hashtable, we use the hash % capacity to calculate an index number
         * EX.
         * key.hashCode() % capacity = index
         * 
         * bucket = an indexed storage location for one or more Entries
         * can store mutiple Entries in case of a collison (linked similarly a
         * LinkedList)
         * 
         * collision = hash function generates the same index for more than one key
         * less collisions = more efficiency
         * 
         * Runtime complexity:
         * Best Case 0(1)
         * Worst Case 0(n)
         */
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        // table.remove(777);

        for (Integer key : table.keySet()) {
            // System.out.println(key + "\t" + table.get(key));
            System.out.println(key.hashCode() % 10 + "\t" + table.get(key));
        }

        // different data type may have different hashcode formula
        // ex String instead of integer
        // to avoid collison by modulations, increase size
    }
}
