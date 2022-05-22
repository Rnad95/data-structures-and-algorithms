package Challenge32;

import Challenge32.btData.BTNode;
import Challenge32.dataStructure.HashTable;
import Challenge32.structure.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeIntersection <T>{
    static List result = new ArrayList<>();
    static HashTable<String,String> hashMap = new HashTable<>();

    public static List tree_intersection(BinaryTree Bt1 , BinaryTree Bt2) {
        if(Bt2.getRoot()!=null && Bt1.getRoot()!=null ) {

            tree_intersection(new BinaryTree(Bt1.getRoot().getLeft()), new BinaryTree(Bt2.getRoot()));
            tree_intersection(new BinaryTree(Bt1.getRoot().getRight()), new BinaryTree(Bt2.getRoot()));

            if(Bt1.getRoot().getValue()==(Bt2.getRoot().getValue())) {
                hashMap.set(Bt1.getRoot().getValue().toString(), Bt2.getRoot().getValue().toString());
            }

            tree_intersection(new BinaryTree(Bt1.getRoot()), new BinaryTree(Bt2.getRoot().getLeft()));
            tree_intersection(new BinaryTree(Bt1.getRoot()), new BinaryTree(Bt2.getRoot().getRight()));
        }

        result = hashMap.keys();
        return result;
    }

}




