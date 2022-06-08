import javax.sound.sampled.SourceDataLine;

public class WorkingWithRecursion {
    public static void main(String[] args) {
        /**
         * Recursion = When a thing is defined in terms of itself. - Wikipedia
         * Apply the result of a procedure, to a procedure.
         * A recursive method calls itself. Can be a substitute for iteration.
         * Divide a problem into sub-problems of trhe same type as the original.
         * Commonly used with advanced sorting algorithms and navigating trees.
         * 
         * Advantages
         * ----------
         * easier to read/write
         * easier to debug
         * 
         * Disadvantages
         * ----------
         * sometimes slower
         * use more memory
         */

        walk(5);
    }

    private static void walk(int steps) {
        if (steps < 1)
            return; // base case
        System.out.println("You take a step.");
        walk(steps - 1); // recursive
    }
}
