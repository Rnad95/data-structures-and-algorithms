package Challenge30;

import Challenge30.dataStructure.HashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import static Challenge30.RepeatedWord.repeatedWord;

public class App {

    public static void main(String[] args) {

        HashTable<String, String> hashTable = new HashTable<>();
//        hashTable.set("JAVA", "JAVA");
//        hashTable.set("JAVASCRIPT", "JAVASCRIPT");
//        hashTable.set("Amman", "JORDAN");
//        hashTable.set("AMMAN", "CAPTIAL OF JORDAN");
//        hashTable.set("PYTHON", "PYTHON");
//        System.out.println(hashTable.get("JJ"));
//        System.out.println(hashTable.contains("JAVASCRIPT"));
//        System.out.println(hashTable.keys());
        hashTable.set("JAVA", "Best");
        System.out.println(hashTable.get("Amman"));
        
        String str = "Renad, my name renad my";
        repeatedWord(str);

    }

}
