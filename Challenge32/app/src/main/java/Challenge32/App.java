package Challenge32;


import Challenge32.btData.BTNode;
import Challenge32.structure.BinaryTree;

import java.util.*;

import static Challenge32.TreeIntersection.tree_intersection;

public class App {

    public static void main(String[] args) {

        BTNode<String> btNode = new BTNode<>("A");
        btNode.setLeft(new BTNode<>("B"));
        btNode.getLeft().setLeft(new BTNode<>("C"));
        btNode.getLeft().setRight(new BTNode<>("Z"));

        btNode.setRight(new BTNode<>("T"));
        btNode.getRight().setRight(new BTNode<>("F"));
        btNode.getRight().getRight().setRight(new BTNode<>("R"));

        BinaryTree<String> Bt1= new BinaryTree<>(btNode);
        Bt1.preOrder(btNode);

        System.out.println();
        System.out.println("**************");

        BTNode<String> btNode2 = new BTNode<>("A");
        btNode2.setLeft(new BTNode<>("E"));
        btNode2.getLeft().setLeft(new BTNode<>("D"));
        btNode2.getLeft().setRight(new BTNode<>("Q"));

        btNode2.setRight(new BTNode<>("M"));
        btNode2.getRight().setRight(new BTNode<>("F"));
        btNode2.getRight().getRight().setRight(new BTNode<>("R"));

        BinaryTree<String> Bt2= new BinaryTree<>(btNode2);
        Bt2.preOrder(btNode2);
        System.out.println();
        System.out.println("******************");

        List result = tree_intersection(Bt1,Bt2);

        System.out.println(result);

    }



}
