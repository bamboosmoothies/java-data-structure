public class BigOnotation {
    public static void main(String[] args) {
        /**
         * Big O Notation:
         * "How code slows as data grows."
         * 1.) Desribes the perforamance of an algorithm as the amount of data increases
         * 2.) Machine independent (# of steps to completion)
         * 3.) Ignore smaller operations 0(n + 1) -> 0(n)
         * n = amount of data (it's a variable like x)
         * runtime complexitiy of ~ different example below
         * 
         * ____________________________________________________
         * 
         * *fastest to slowest (assuming large datasets)
         * 
         * 0(1) = constant time:
         * random access of an element in an array
         * inserting at the beginning of linkedlist
         * 
         * 0(log n) = logarithmic time:
         * binary search
         * 
         * 0(n) = linear time:
         * looping through elements in an array
         * searching through a linkedlist
         * 
         * 0(n log n) = quasilinear time:
         * quicksort
         * mergesort
         * heapsort
         * 
         * 0(n^2) quadratic time:
         * insertion sort
         * selection sort
         * bubble sort
         * 
         * 0(n!) factorial time:
         * traveling salesman problem
         * ____________________________________________________
         * 
         */
    }
}
