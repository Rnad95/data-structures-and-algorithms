package Challenge11.Stack;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Stack {

     NodeStack top;
     LinkedList<NodeStack> items = new LinkedList<>();
    public Stack() {
        top = null;
    }

    public NodeStack getTop() {
        return top;
    }

    public boolean isEmpty(){
        return top == null;

    }
    public NodeStack push(NodeStack value){
        items.add(value);
        value.setNext(top);
        top = value;
        return value;
    }

    public NodeStack pop(){
        NodeStack temp=top;
        if (isEmpty()) {
            throw new NoSuchElementException("The stack is empty");
        } else {
            items.removeLast();
            top = top.getNext();
        }
        return temp;
    }

    public NodeStack peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("The Stack is Empty");
        } else{
            return top;
        }
    }

    @Override
    public String toString() {
        return "Stack { " +
                "items = " + items +
                " }";
    }
}
