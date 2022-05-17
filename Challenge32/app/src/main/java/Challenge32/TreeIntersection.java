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
    public static List tree_intersection(BinaryTree Bt1 , BinaryTree Bt2) {

        Map<String,String> hashMap = new HashMap();
//        if(Bt2.getRoot()!=null || Bt1.getRoot()!=null ) {

            if (Bt2.getRoot() != null && Bt1.getRoot() != null) {
                hashMap.put(Bt2.getRoot().getValue().toString(), "null");
                if (hashMap.keySet().contains(Bt1.getRoot().getValue())) {
                    hashMap.put(Bt2.getRoot().getValue().toString(), Bt1.getRoot().getValue().toString());
                    result.add(Bt1.getRoot().getValue().toString());
                }
                tree_intersection(new BinaryTree(Bt1.getRoot().getLeft()),new BinaryTree(Bt2.getRoot().getLeft()));
                tree_intersection(new BinaryTree(Bt1.getRoot().getRight()),new BinaryTree(Bt2.getRoot().getRight()));

                /**
                 * Fix it to be search for element in the whole tree
                 */
//                tree_intersection(new BinaryTree(Bt1.getRoot()), new BinaryTree(Bt2.getRoot().getLeft()));
//                tree_intersection(new BinaryTree(Bt1.getRoot()), new BinaryTree(Bt2.getRoot().getRight()));
//            }

//            for (Map.Entry<String,String> entry : hashMap.entrySet()) {
//                System.out.println(entry.getKey() + ", Stock : " + entry.getValue());
//            }

        }
        return result;
    }



}



