package Challenge15.dataStructure;

import Challenge15.data.Node;

public class BinaryTree {
    private String str="";
    private int max=0;
    Node root;
    public BinaryTree() {
    }
    public BinaryTree(int value) {
        setRoot(new Node(value));
    }
    public Node getRoot() {
        return root;
    }
    public void setRoot(Node root) {
        this.root = root;
    }
    public int getMax(){
        Node Root = root;
        if (Root == null)
            return -1;
        int result = Root.getValue();
        root=Root.getLeft();
        int LSide = getMax();
        root=Root.getRight();
        int RSide = getMax();

        if (LSide > result)
            result = LSide;
        if (RSide > result)
            result = RSide;
        return result;
    }
    public String inOrder(Node Root){
    if(Root!=null){
        inOrder(Root.getLeft());
        System.out.print(Root.getValue()+" => ");
        str += Root.getValue()+" => ";
        inOrder(Root.getRight());
    }
    return str;
}
    public String preOrder(Node Root){
        if(Root!=null){
//            System.out.print(Root.getValue()+" => ");
            str += Root.getValue()+" => ";
            preOrder(Root.getLeft());
            preOrder(Root.getRight());
        }
return str;
    }
    public String postOrder(Node Root){
        if(Root!=null){
            str += Root.getValue()+" => ";
            preOrder(Root.getLeft());
            preOrder(Root.getRight());
            System.out.print(Root.getValue()+" => ");
        }
        return str;
    }

}
