package Challenge34.structure;


import Challenge34.btData.BTNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T>{
    List result = new ArrayList<>();

    private String str="";
    BTNode root;
    int count1=0;
    int count2=0;
    public BinaryTree() {
    }

    public BinaryTree(BTNode root) {
        this.root = root;
    }
    public BinaryTree(T root) {
        this.root = new BTNode<>(root);
    }

    public BTNode getRoot() {
        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }

    public String inOrder(BTNode Root){
    if(Root!=null){
        inOrder(Root.getLeft());
        System.out.print(Root.getValue()+" => ");
        str += Root.getValue()+" => ";
        inOrder(Root.getRight());
    }
    return str;
}
    public String preOrder(BTNode Root){
        if(Root!=null){
            System.out.print(Root.getValue()+" => ");
            str += Root.getValue()+" => ";
            preOrder(Root.getLeft());
            preOrder(Root.getRight());
        }
return str;
    }

    public String postOrder(BTNode Root){
        if(Root!=null){
            str += Root.getValue()+" => ";
            preOrder(Root.getLeft());
            preOrder(Root.getRight());
            System.out.print(Root.getValue()+" => ");
        }
        return str;
    }

    public boolean TreeCheck( BTNode root2) {
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
