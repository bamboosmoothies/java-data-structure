package Lesson22_BreadthFirstSearch;

public class BreadthFirstSearch {
    /**
     * BFS = a search algorithm for traversing a tree or graph data structure.
     * This is done one "level" at a time, rather than one "branch" at a time.
     */
    public static void main(String[] args) {
        Graph graph = new Graph(5);
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

        graph.breathFirstSearch(0);
    }

    /**
     * Breadth FS = Traverse a graph level by level
     * utilizes a queue
     * better if destination is on average close to start
     * siblings are visisted before children
     * 
     * Depth FS = Traverse a graph branch by branch
     * Utilizes a stack
     * better if destination is on average far from the start
     * children are visited before siblings
     * more popular for games/puzzles
     */

}
