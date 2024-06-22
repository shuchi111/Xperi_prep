public class BinaryTreeTraversal{

    // Node class representing a node in the
   //binary tree
    public static class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
    this.data = data;
    left = right = null;
    }
    }
    // Root node of the binary tree
    public Node root;
    public BinaryTreeTraversal() {
    root = null;
    }
    // In-order traversal (left, root, right)
    public void inOrderTraversal(Node node) {
    if (node != null) {
    inOrderTraversal(node.left);
    System.out.print(node.data + " ");
    inOrderTraversal(node.right);
    }
    }
   // Pre-order traversal (root, left, right)



public void preOrderTraversal(Node node) {
    if (node != null) {
    System.out.print(node.data + " ");
    preOrderTraversal(node.left);
    preOrderTraversal(node.right);
    }
    }
    // Post-order traversal (left, right, root)
    public void postOrderTraversal(Node node) {
    if (node != null) {
    postOrderTraversal(node.left);
    postOrderTraversal(node.right);
    System.out.print(node.data + " ");
    }
    }
    // Example usage: Create a binary tree and perform
  
    public static void main(String[] args) {
    BinaryTreeTraversal tree = new
   BinaryTreeTraversal();
    // Sample tree
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    System.out.println("In-order traversal:");
    tree.inOrderTraversal(tree.root);
    System.out.println("\nPre-order traversal:");
    tree.preOrderTraversal(tree.root);
    System.out.println("\nPost-order traversal:");
    tree.postOrderTraversal(tree.root);
    }
   }