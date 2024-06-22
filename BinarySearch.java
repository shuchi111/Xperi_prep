// package binary_tree;

public class BinarySearch {

    public static class Node {

        int data;
        Node left;
        Node right;

        // Node class represents a node in the tree
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    private Node root; // Root node of theBST

    public BinarySearch() {
        this.root = null;
    }
    // Insert a new node into the BST

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        while (true) {
            if (data < current.data) {
                if (current.left == null) {
                    current.left = newNode;
                    break;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    break;
                }
                current = current.right;
            }
        }
    }
    // Search for a node with a specific data value

    public boolean search(int data) {
        Node current = root;
        while (current != null) {
            if (data == current.data) {
                return true; // Found the node
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false; // Node not found
    }
}
