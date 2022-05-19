package Challenge32.antonyms;

import java.util.LinkedList;
import java.util.List;

public class Join<T> {

    private LinkedList<JoinNode> result = new LinkedList<>();
    private int count;
    public Join() {
    }

    public int size() {
        return count;
    }

    public List CreateSynonmAndAntonyms(Object keys, Object synonms, Object antonyms){
            result.add(new JoinNode<>(keys,synonms,antonyms));
            count++;
        return result;
    }

}
