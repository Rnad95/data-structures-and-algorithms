package Challenge17.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Node {
    private final int value;
    private List<Node> childern;

    public Node(int element) {
        value = element;
        childern = new ArrayList<>();
    }

    public int getValue() {
        return value;
    }

    public void setNode(int value){
        Node node = new Node(value);
        childern.add(node);
    }

    public Node getChild() {
        return childern.get(childern.size()-1);
    }

    public List<Node> getChildern() {
        return childern;
    }



    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}