package Challenge30;

import Challenge30.dataStructure.HashTable;

import java.util.Hashtable;

public class App {

    public static void main(String[] args) {
        HashTable<String, String> hashTable = new HashTable<>();
        hashTable.set("JAVA", "JAVA");
        hashTable.set("JAVASCRIPT", "JAVASCRIPT");
        hashTable.set("Amman", "JORDAN");
        hashTable.set("AMMAN", "CAPTIAL OF JORDAN");
        hashTable.set("PYTHON", "PYTHON");
        System.out.println(hashTable.get("JJ"));
        System.out.println(hashTable.contains("JAVASCRIPT"));
        System.out.println(hashTable.keys());

    }
}
