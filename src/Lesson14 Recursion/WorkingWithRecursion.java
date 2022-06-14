
public class WorkingWithRecursion {
    public static void main(String[] args) {
        /**
         * Recursion = When a thing is defined in terms of itself. - Wikipedia
         * Apply the result of a procedure, to a procedure.
         * A recursive method calls itself. Can be a substitute for iteration.
         * Divide a problem into sub-problems of trhe same type as the original.
         * Commonly used with advanced sorting algorithms and navigating trees.
         * Recursive code calls itself, iteration uses loops.
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
         * stackOverFlow error due to memory over-usage
         * 
         * Callstack - keeps track of the order in which our program needs to function
         * 
         */

        // walk(5);
        System.out.println(factorial(7));
    }

    private static int factorial(int num) {
        if (num < 1)
            return 1; // base case
        return num * factorial(num - 1); // recursive
    }

    // Iterative method (representation of the process)

    // private static void walk(int steps){
    // for (int i = 0; i < steps; i++) {
    // System.out.println("You take a step!");
    // }
    // }

    // Recursive method (representation of a procedure)

    // private static void walk(int steps) {
    // if (steps < 1)
    // return; // base case
    // System.out.println("You take a step.");
    // walk(steps - 1); // recursive
    // }
}
