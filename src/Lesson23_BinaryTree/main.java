package Lesson23_BinaryTree;

public class main {
    public static void main(String[] args) {
        /**
         * binary tree - a tree that has no more than 2 childrens
         * binary search tree - value are arranged in a certain order
         */

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.remove(1);

        tree.display();

        System.out.println(tree.search(1));

        /**
         * Binary Search Tree = A tree data structure, where each node is greater than
         * it's left child, but less than it's right.
         * benefit: easy to locate a node wghen they are in this order
         * time complexity: best case: 0(log n), worst case: 0(n)
         * space complexity: 0(n)
         */
    }
}
