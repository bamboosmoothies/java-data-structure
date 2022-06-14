public class WorkingWithQuickSort {
    public static void main(String[] args) {

        /**
         * quick sort = moves smaller elements to left of a pivot.
         * recursively divide array in 2 partitions
         * 
         * run-time coplexity = best case 0(n log(n))
         * average case 0(n log(n))
         * worst case 0(n^2) if already sorted
         * 
         * space complexity = 0(log(n)) due to recursion
         */

        int array[] = { 8, 2, 5, 3, 4, 7, 6, 1 };

        quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end <= start)
            return; // base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);

    }

    // Helper function
    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;

    }
}
