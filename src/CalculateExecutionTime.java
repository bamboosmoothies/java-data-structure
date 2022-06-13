import BinaryTree.main;

public class CalculateExecutionTime {
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();

        // ---------- program ---------

        // Put code block inside here
        Thread.sleep(3000);

        // -----------end of program-----

        long duration = (System.nanoTime() - start) / 1000000;
        System.out.println(duration + "ms");
    }
}
