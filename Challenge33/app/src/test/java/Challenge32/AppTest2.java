package Challenge32;


import Challenge32.btData.BTNode;
import Challenge32.structure.BinaryTree;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static Challenge32.TreeIntersection.tree_intersection;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest2 {

    @Test
    void test_NoCommonElement(){
        BTNode<String> btNode = new BTNode<>("A");
        btNode.setLeft(new BTNode<>("B"));
        btNode.getLeft().setLeft(new BTNode<>("C"));
        btNode.getLeft().setRight(new BTNode<>("D"));

        btNode.setRight(new BTNode<>("E"));
        btNode.getRight().setRight(new BTNode<>("F"));

        BinaryTree<String> Bt3 = new BinaryTree<>(btNode);

        BTNode<String> btNode2 = new BTNode<>("G");
        btNode2.setLeft(new BTNode<>("H"));
        btNode2.getLeft().setLeft(new BTNode<>("I"));
        btNode2.getLeft().setRight(new BTNode<>("J"));

        btNode2.setRight(new BTNode<>("Q"));
        btNode2.getRight().setRight(new BTNode<>("R"));
        btNode2.getRight().getRight().setRight(new BTNode<>("S"));

        BinaryTree<String> Bt4 = new BinaryTree<>(btNode2);

        List result = tree_intersection(Bt3, Bt4);
        List expected = new ArrayList<>();
        System.out.println(result);
        assertEquals(expected,result);

    }
}
