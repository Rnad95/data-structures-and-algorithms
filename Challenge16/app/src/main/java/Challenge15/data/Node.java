package Challenge15.data;

public class Node {
    private final int value;
    private Node left;
    private Node right;

    public Node(int element) {
        value = element;
    }

    public int getValue() {
        return value;
    }

    public boolean hasLeft(){
        if(getLeft()==null)
            return false;
        return true;
    }
    public boolean hasRight(){
        if(getRight()==null)
            return false;
        return true;
    }
    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(int value) {
        Node left = new Node(value);
        this.left = left;
    }

    public void setRight(int value) {
        Node right = new Node(value);
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
