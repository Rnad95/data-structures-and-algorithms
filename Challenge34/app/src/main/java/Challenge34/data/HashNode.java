package Challenge34.data;

public class HashNode <K, V> {
    private final K key;
    private V value;
    private final Integer hashCode;
    private HashNode<K, V> next;

    public HashNode(K key, V value, Integer hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }


    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value){
        this.value = value;
    }
    public HashNode<K, V> getNext() {
        return next;
    }

    public void setNext(HashNode<K, V> next) {
        this.next = next;
    }

    public Integer getHashCode() {
        return hashCode;
    }

}
