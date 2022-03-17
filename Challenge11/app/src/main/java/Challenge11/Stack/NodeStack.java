package Challenge11.Stack;

public class NodeStack {

    private final String item;
    private NodeStack next;

    public NodeStack(String item) {
        this.item = item;
    }

    public String getItem() {
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
