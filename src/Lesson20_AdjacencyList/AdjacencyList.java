package Lesson20_AdjacencyList;

public class AdjacencyList {
    public static void main(String[] args) {
        /**
         * Adjacency List = An array/arraylist of linkedlists.
         * Each LinkedList has a unique node at the head.
         * ALL adjacent neighbors to that node are added to that node's linkedList.
         * 
         * runtime complexity tro check an Edge: 0(v)
         * space complexity: 0(v + e)
         */

        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();
    }
}
