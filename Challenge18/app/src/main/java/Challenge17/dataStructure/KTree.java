package Challenge17.dataStructure;

import Challenge17.data.Node;

import java.util.List;

public class KTree {

    Node root;
    public KTree() {
    }

    public KTree(int value) {
        setRoot(new Node(value));
    }

    public KTree(Node value) {
        setRoot(value);
    }

    public Node getRoot() {
        return root;
    }
    public void setRoot(Node root) {
        this.root = root;
    }
    public  void print(Node Root){
        String s = Root.getValue() + " => ";
        for (int i = 0; i <Root.getChildern().size() ; i++) {
            s =s +Root.getChildern().get(i)+",";
        }
        System.out.println(s);
        for (int i = 0; i <Root.getChildern().size() ; i++) {
            print(Root.getChildern().get(i));
        }
    }

    public  void fizzBuzzTree(Node Root){
        String s = Root.getValue() + " => ";
        for (int i = 0; i <Root.getChildern().size() ; i++) {
            int n = Root.getChildern().get(i).getValue();
            if(n%3 == 0) {
                if (n % 5 == 0)
                    s = s + "FizzBuzz" + ",";
                else
                    s = s + "Fizz" + ",";
            }else if (n%5 ==0)
                s = s + "buzz" + ",";
            else
            s =s +Root.getChildern().get(i)+",";

        }
        System.out.println(s);
        for (int i = 0; i <Root.getChildern().size() ; i++) {
            fizzBuzzTree(Root.getChildern().get(i));
        }
    }



}