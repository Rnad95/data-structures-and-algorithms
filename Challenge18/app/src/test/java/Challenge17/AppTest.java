/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge17;

import Challenge17.data.Node;
import Challenge17.dataStructure.KTree;
import org.junit.jupiter.api.Test;


import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

@Test void addOneElement() {
    Node root = new Node(2);
    Node node1 = new Node(3);
    root.getChildern().add(node1);
    KTree kt = new KTree(root);
    String str = "[Node{value=3}]";
     assertEquals(str,root.getChildern().toString());
    }
    @Test void FizzBuzzTest() {
        Node root = new Node(2);
        Node element1 = new Node(3);
        Node element2 = new Node(4);
        Node element3 = new Node(5);
        root.getChildern().add(element1);
        root.getChildern().add(element2);
        root.getChildern().add(element3);
        KTree kt = new KTree(root);
        String str = "[Node{value=3}, Node{value=4}, Node{value=5}]";
        assertEquals(str,root.getChildern().toString());
    }

}