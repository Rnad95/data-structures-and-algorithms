package Challenge10.Stack;

public class NodeStack {

    private final char item;
    private NodeStack next;

    public NodeStack(char item) {
        this.item = item;
    }

    public char getItem() {
        return item;
    }

    public NodeStack getNext() {
        return next;
    }

    public void setNext(NodeStack next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeStack{" +
                "item='" + item + '\'' +
                '}';
    }
}
