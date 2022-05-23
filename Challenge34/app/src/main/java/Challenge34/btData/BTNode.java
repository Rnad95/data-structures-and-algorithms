package Challenge34.btData;

public class BTNode <T>{
    private final T value;
    private BTNode left;
    private BTNode right;
    private int count;

    public BTNode(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public BTNode getLeft() {
        return left;
    }
    public void setLeft(BTNode left) {
        this.left = left;
        count++;
    }
    public BTNode getRight() {
        return right;
    }
    public void setRight(BTNode right) {
        this.right = right;
        count++;
    }

    public int getCount() {
        return count;
    }
}
