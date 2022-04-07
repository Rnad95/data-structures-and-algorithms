package Challenge15.dataStructure;

import Challenge15.data.Node;

public class BinaryTree {
    private String str="";
    Node root;
    int count1=0;
    int count2=0;
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

//    public void inOrder(Node Root){
//        if(Root!=null){
//            inOrder(Root.getLeft());
//            System.out.print(Root.getValue()+" => ");
//            inOrder(Root.getRight());
//        }
//
//    }
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
            System.out.print(Root.getValue()+" => ");
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

    public boolean TreeCheck( Node root2) {
        if (root != null) {
            if (root2.getLeft() == null) {
                count2++;
            }
            TreeCheck(root2.getLeft());
            if (root2.getLeft() == null) {
                count2++;
            }
            TreeCheck(root2.getRight());

        }
        return count1 == count2;
    }
}
