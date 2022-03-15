package Challenge10.Queue;

public class NodeQueue {

    private final String item;
    private NodeQueue next;

    public NodeQueue(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public NodeQueue getNext() {
        return next;
    }

    public void setNext(NodeQueue next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeStack{" +
                "item='" + item + '\'' +
                '}';
    }
}
