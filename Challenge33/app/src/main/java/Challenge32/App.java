package Challenge32;


import Challenge32.btData.BTNode;
import Challenge32.dataStructure.HashTable;
import Challenge32.structure.BinaryTree;

import java.util.*;

import static Challenge32.LeftJoin.leftJoin;
import static Challenge32.TreeIntersection.tree_intersection;

public class App {

    public static void main(String[] args) {

        HashTable<String,String> hashTable1 = new HashTable<>();
        hashTable1.set("ID1","Renad");
        hashTable1.set("ID2","Malak");
        hashTable1.set("ID3","Eman");
        hashTable1.set("ID4","Jamil");
        hashTable1.set("ID5","Tala");
        hashTable1.set("ID6","Mousa");
        hashTable1.set("ID7","Sami");

        HashTable<String,String> hashTable2 = new HashTable<>();
        hashTable2.set("ID1","Jamil");
        hashTable2.set("ID2","Mohammad");
        hashTable2.set("ID3","Tawfeeq");
        hashTable2.set("ID4","Mousa");
        hashTable2.set("ID5","Sami");
        hashTable2.set("ID6","Mousa");
        hashTable2.set("ID7","Sami");

        leftJoin(hashTable1,hashTable2);
    }



}
