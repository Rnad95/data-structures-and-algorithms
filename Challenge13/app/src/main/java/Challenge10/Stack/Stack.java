package Challenge10.Stack;

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

    public int length() {
        return items.size();
    }

    public boolean isEmpty(){
        return top == null;

    }
    public NodeStack push(char str){
        NodeStack value = new NodeStack(str);
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

    public char peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("The Stack is Empty");
        } else{
            return top.getItem();
        }
    }

    @Override
    public String toString() {
        return "Stack { " +
                "items = " + items +
                "\ntop = " + top.getItem() +
                " }";
    }
}
