package LTUCTest;

import java.io.IOException;

public class linkedList <T>{

    Node Head;
    public  int count =0;
    public linkedList(){
        this.Head = null;
    }

    public void append(T value){
        Node newNode = new Node(value);
        Node pointer = this.Head;
        if(pointer==null){
            newNode.Next = this.Head;
            this.Head = newNode;
        }
        while(pointer != null){
            if(pointer.Next == null){

                pointer.Next = newNode;
                newNode.Next = null;
                ++count;
                break;
            }
            pointer = pointer.Next;
        }
    }
    public void insertAfter( T item, T value){
        Node pointer = this.Head;
        Node newNode = new Node(value);
        while(pointer != null) {

            if(pointer.value == item) {
                try {
                    newNode.Next = pointer.Next;
                    pointer.Next=newNode;
                    ++count;
                    break;
                }catch (Exception err){
                    System.out.println(err.getMessage());
                }

            }
            pointer = pointer.Next;

        }
    }
    public void insertBefore( T item, T value){
        Node newNode = new Node(value);
        Node pointer = this.Head;

        if(pointer == null){
            newNode.Next = this.Head;
            this.Head = newNode;
        }

        while(pointer != null) {
            if(pointer.Next.value == item) {
                try {
                    newNode.Next = pointer.Next;
                    pointer.Next=newNode;
                    ++count;
                    break;
                }catch (Exception err){
                    System.out.println(err.getMessage());
                }
            }
            pointer = pointer.Next;
        }
    }
    public void insert(T value){
        Node newNode = new Node(value);
        try {
            newNode.Next = this.Head;
            this.Head = newNode;
            ++count;

        }catch (Exception er) {
            System.out.println(er.getMessage());
        }
    }
    public int length(){
        return count;
    }
    public void print(){
        Node pointer = this.Head;
        while(pointer != null){
            System.out.print(pointer.value+"\t");
            pointer = pointer.Next;
        }
        System.out.println();
    }

}
