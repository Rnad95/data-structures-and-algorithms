package Challenge11.Queue;

import Challenge11.Stack.NodeStack;
import Challenge11.Stack.Stack;

import java.util.NoSuchElementException;

public class PseudoQueue {


    private int SIZE;
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public PseudoQueue() {
        SIZE = 0;
    }

    public int getSIZE() {
        return SIZE;
    }

    public boolean enqueue(String value1){
        NodeStack value=new NodeStack(value1);
//       if(stack1.isEmpty()){
//           stack1.push(value);
//       }
        try{
           while (!stack1.isEmpty()) {
               stack2.push(stack1.pop());
           }
           stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        SIZE++;
        return true;
        }catch (Exception err) {
            System.out.println(err.getMessage());
            return false;
        }
    }
    public NodeStack dequeue() {

        if(stack1.isEmpty()){
            NodeStack empty = new NodeStack("Error, The Queue is empty");
//            System.out.println("Error, The Queue is empty");
            return empty;
        }

            stack2.push(stack1.pop());


        NodeStack temp = stack2.peek();
        stack2.pop();

//        while (!stack2.isEmpty()) {
//            stack1.push(stack2.pop());
//        }
        SIZE--;
        return temp;
    }

    @Override
    public String toString() {
        return "PseudoQueue{" +
               stack1 +
                '}';
    }
}
