package Challenge08;

import java.io.IOException;

public class LinkedList <T> {
    Node Head;
    public int count = 0;
    public int i;
    public LinkedList() {
        this.Head = null;

    }
    public void append(T value) {
        Node newNode = new Node(value);
        Node pointer = this.Head;
        if (pointer == null) {
            newNode.Next = this.Head;
            this.Head = newNode;
            ++count;
        }
        while (pointer != null) {
            if (pointer.Next == null) {
                pointer.Next = newNode;
                newNode.Next = null;
                ++count;
                break;
            }
            pointer = pointer.Next;
        }
    }
    public void insertAfter(T item, T value) {
        Node pointer = this.Head;
        Node newNode = new Node(value);
        while (pointer != null) {

            if (pointer.value == item) {
                try {
                    newNode.Next = pointer.Next;
                    pointer.Next = newNode;
                    ++count;
                    break;
                } catch (Exception err) {
                    System.out.println(err.getMessage());
                }

            }
            pointer = pointer.Next;

        }
    }
    public void insertBefore(T item, T value) {
        Node newNode = new Node(value);
        Node pointer = this.Head;

        if (pointer == null) {
            newNode.Next = this.Head;
            this.Head = newNode;
        }

        while (pointer != null) {
            if (pointer.Next.value == item) {
                try {
                    newNode.Next = pointer.Next;
                    pointer.Next = newNode;
                    ++count;
                    break;
                } catch (Exception err) {
                    System.out.println(err.getMessage());
                }
            }
            pointer = pointer.Next;
        }
    }
    public void insert(T value) {
        Node newNode = new Node(value);
        try {
            newNode.Next = this.Head;
            this.Head = newNode;
            ++count;

        } catch (Exception er) {
            System.out.println(er.getMessage());
        }
    }
    public int length() {
        return count;
    }
    public void print() {

        Node pointer = this.Head;
        while (pointer != null) {
            System.out.print(pointer.value + "\t");
            pointer = pointer.Next;
        }
        System.out.println();
    }
    public int kthFromEnd(int k) {
        Node pointer = this.Head;
        int count1 = count-1;
        try {
            while (pointer != null) {
                pointer.index = count1;
                pointer = pointer.Next;
                count1--;
            }
            Node pointer2 = this.Head;
            while (pointer2 != null) {
                if (pointer2.index == k) {
                    this.i = k;
                    return (int) pointer2.value;

                }
                pointer2 = pointer2.Next;
            }
        }catch (Exception err){
            System.out.println(err.getMessage());
        }
        return -1;
    }

    public static LinkedList zipLists(LinkedList ls1,LinkedList ls2){
        LinkedList result = new LinkedList<>();
        Node pointer = ls1.Head;
        Node pointer2 = ls2.Head;
        if(ls2.length() == ls1.length())
        while (pointer != null) {
            result.append(pointer.value);
            result.append(pointer2.value);

            pointer = pointer.Next;
            pointer2 = pointer2.Next;
        }
        if(ls2.length() > ls1.length())
            while (pointer2 != null) {
                if(pointer != null)
                    result.append(pointer.value);
                result.append(pointer2.value);

                if(pointer!= null)
                    pointer = pointer.Next;
                pointer2 = pointer2.Next;
            }
        if(ls2.length() < ls1.length())
            while (pointer != null) {
                    result.append(pointer.value);
                    if(pointer2 != null)
                        result.append(pointer2.value);
                    pointer = pointer.Next;
                    if(pointer2 != null)
                        pointer2 = pointer2.Next;
            }
        return result;
    }
    public int getI() {
        return i;
    }


}
