package Challenge32;


import Challenge32.btData.BTNode;
import Challenge32.dataStructure.HashTable;
import Challenge32.structure.BinaryTree;

import java.util.*;

import static Challenge32.LeftJoin.leftJoin;
import static Challenge32.TreeIntersection.tree_intersection;

public class App {

    public static void main(String[] args) {

        BTNode<String> btNode = new BTNode<>("A");
        btNode.setLeft(new BTNode<>("B"));
        btNode.getLeft().setLeft(new BTNode<>("R"));
        btNode.getLeft().setRight(new BTNode<>("D"));

        btNode.setRight(new BTNode<>("E"));
        btNode.getRight().setRight(new BTNode<>("F"));

        BinaryTree<String> Bt1= new BinaryTree<>(btNode);
        Bt1.preOrder(btNode);

        System.out.println();
        System.out.println("**************");

        BTNode<String> btNode2 = new BTNode<>("G");
        btNode2.setLeft(new BTNode<>("H"));
        btNode2.getLeft().setLeft(new BTNode<>("I"));
        btNode2.getLeft().setRight(new BTNode<>("J"));

        btNode2.setRight(new BTNode<>("Q"));
        btNode2.getRight().setRight(new BTNode<>("R"));
        btNode2.getRight().getRight().setRight(new BTNode<>("S"));

        BinaryTree<String> Bt2= new BinaryTree<>(btNode2);
        Bt2.preOrder(btNode2);
        System.out.println();
        System.out.println("******************");

        List result = tree_intersection(Bt1,Bt2);
        System.out.println(result);

//        HashTable<String,String> hashTable1 = new HashTable<>();
//        hashTable1.set("ID1","Renad");
//        hashTable1.set("ID2","Malak");
//        hashTable1.set("ID3","Eman");
//        hashTable1.set("ID4","Jamil");
//        hashTable1.set("ID5","Tala");
//        hashTable1.set("ID6","Mousa");
//        hashTable1.set("ID7","Sami");
//
//        HashTable<String,String> hashTable2 = new HashTable<>();
//        hashTable2.set("ID1","Jamil");
//        hashTable2.set("ID2","Mohammad");
//        hashTable2.set("ID3","Tawfeeq");
//        hashTable2.set("ID4","Mousa");
//        hashTable2.set("ID5","Sami");
////        hashTable2.set("ID6","Mousa");
//        hashTable2.set("ID7",null);
//
//        leftJoin(hashTable1,hashTable2);
    }



}
