package Challenge15.dataStructure;

import Challenge15.data.Node;

public class BinarySearchTree {

    Node root;
    boolean result;
    int summation;
    int count, count2;

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            Node pointer = root;
            traverse(pointer, value);
        }
    }

    private void traverse(Node current, int value) {
        if (value > current.getValue()) {
            if (current.getRight() == null) {
                current.setRight(value);
                return;
            }

            current = current.getRight();
        } else {
            if (current.getLeft() == null) {
                current.setLeft(value);
                return;
            }

            current = current.getLeft();
        }
        traverse(current, value);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public boolean Contains(Node root, int value) {
        Node Root;
        Node pointer = root;
        if (pointer.getValue() == value) {
            result = true;
            return true;
        }

        if (value > pointer.getValue()) {
            pointer = pointer.getRight();
        } else {
            pointer = pointer.getLeft();
        }
        Root = pointer;

        if (Root == null) {
            result = false;
            return result;
        }
        Contains(Root, value);
        return result;
    }


        public boolean CompareTrees(Node root1, Node root2) {
            if (root1 == null )
                count++;
            if(root2 == null)
                count2++;
            else {
                if (root1 != null)
                    if (root2 != null) {
                        CompareTrees(root1.getLeft(), root2.getLeft());
                        CompareTrees(root1.getRight(), root2.getRight());
                    }
            }
            return count2==count;
    }

}
