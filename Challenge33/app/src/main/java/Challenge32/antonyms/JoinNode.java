package Challenge32.antonyms;

import java.util.ArrayList;
import java.util.List;

public class JoinNode<T>{

    T key;
    T antonyms;
    T synonym;
    List<JoinNode> result = new ArrayList<>();

    public JoinNode() {
    }

    public JoinNode(T key, T antonyms, T synonym) {
        this.key = key;
        this.antonyms = antonyms;
        this.synonym = synonym;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public T getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(T antonyms) {
        this.antonyms = antonyms;
    }

    public T getSynonym() {
        return synonym;
    }

    public void setSynonym(T synonym) {
        this.synonym = synonym;
    }
}
