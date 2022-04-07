/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge15;

import Challenge15.data.Node;
import Challenge15.dataStructure.BinarySearchTree;
import Challenge15.dataStructure.BinaryTree;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.setLeft(2);
        root.getLeft().setLeft(3);
        root.getLeft().setRight(4);
        root.setRight(5);
        root.getRight().setLeft(2);

        BinaryTree BT = new BinaryTree(3);
        BT.setRoot(root);
//        System.out.println();
//        BT.inOrder(root);
//        System.out.println();
//        BT.preOrder(root);
//        System.out.println();
//        BT.postOrder(root);
        Node root2 = new Node(1);
        root.setLeft(2);
        root.getLeft().setLeft(3);
        root.getLeft().setRight(4);
        root.setRight(5);
        root.getRight().setLeft(2);

        BinaryTree BT2 = new BinaryTree(3);
        BT.setRoot(root);
        Node root1 = new Node(3);
        BinarySearchTree BST = new BinarySearchTree();
        BST.setRoot(root1);
        BST.add(1);
        BST.add(4);
        BST.add(2);
        BST.add(5);

    }
}
