package Challenge10.Queue;

import Challenge10.Stack.NodeStack;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue {

    private NodeQueue back;
    private NodeQueue front;
    private int SIZE;
    private LinkedList<NodeQueue> Items = new LinkedList<>();

    public Queue() {
        front = null;
        SIZE=0;
    }
    public int getSIZE() {
        return SIZE;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public boolean enqueue(NodeQueue value){
        Items.add(value);
        value.setNext(back);
        SIZE++;
        int i = (isEmpty()) ? 1:0;
        switch (i) {
            case 1:
                front = value;
                back = value;

                return true;
            case 0:
                back.setNext(value);
                back = value;

                return true;
        }

        return false;
    }
    public NodeQueue dequeue(){
        NodeQueue frontTemp;
        if (isEmpty()) {
           throw new NoSuchElementException("The queue is empty");
        } else {
            frontTemp = front;
            Items.remove();
            front = front.getNext();
            SIZE--;
        }

        return frontTemp;
    }

    public NodeQueue peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("The Stack is Empty");

        } else{
            return front;
        }
    }


    @Override
    public String toString() {
        return "Queue { " +
                " back  = " + back +
                " front = " + front+
                " }";
    }
}
