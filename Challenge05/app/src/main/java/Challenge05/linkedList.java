package Challenge05;



import java.io.IOException;

public class linkedList<T> {
    Node Head;
    public int count=0;


    public linkedList(){
        this.Head = null;
    }

    public String insert(T value){
        Node newNode = new Node(value);
        try {
            newNode.Next = this.Head;
            this.Head = newNode;
            count++;
            return "Success";
        }catch (Exception er) {
            System.out.println(er.getMessage());
        }
        return  "False";
    }

    public int length(){

        return count;
    }
    public Boolean includes(T value){
        Node pointer = this.Head;
        while(pointer != null) {
            if(pointer.Next == value)
                return true;
            pointer = pointer.Next;
        }
        return false;
    }
    public void toSring(){
        Node pointer = this.Head;
//        "{ a } -> { b } -> { c } -> NULL"
//        System.out.print("{");
        while(pointer != null){
            System.out.print("{ "+ pointer.value +" } -> ");
            pointer = pointer.Next;
        }
        System.out.print("NULL");
    }

    public void print(){
        Node pointer = this.Head;
        while(pointer != null){
            System.out.println(pointer.value);
            pointer = pointer.Next;
        }
    }

}
