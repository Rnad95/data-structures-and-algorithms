package Challenge32;

import Challenge32.btData.BTNode;
import Challenge32.structure.BinaryTree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static Challenge32.TreeIntersection.tree_intersection;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest3 {

    @Test
    void test_OneNodeCommonElement(){
        BTNode<String> btNode = new BTNode<>("A");
        BinaryTree<String> Bt3 = new BinaryTree<>(btNode);

        BTNode<String> btNode2 = new BTNode<>("A");
        btNode2.setLeft(new BTNode<>("C"));
        btNode2.getLeft().setLeft(new BTNode<>("D"));
        btNode2.getLeft().setRight(new BTNode<>("E"));
        btNode2.setRight(new BTNode<>("F"));
        btNode2.getRight().setRight(new BTNode<>("G"));
        btNode2.getRight().getRight().setRight(new BTNode<>("H"));
        BinaryTree<String> Bt4 = new BinaryTree<>(btNode2);

        List result = tree_intersection(Bt3, Bt4);
        List expected = new ArrayList<>();
        expected.add("A");
        System.out.println(result);
        assertEquals(expected,result);

    }
}
