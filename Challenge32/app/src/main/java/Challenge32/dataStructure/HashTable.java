package Challenge32.dataStructure;

import Challenge32.data.HashNode;

import java.util.*;

public class HashTable<K, V> {
    private ArrayList<HashNode<K, V>> bucketArray;
    private int buckets;
    private int size;

    public HashTable() {
        bucketArray = new ArrayList<>();
        buckets = 10;
        for (int index = 0; index < buckets; index++) {
            bucketArray.add(null);
        }
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    private int hashCode(K key) {
        return Objects.hashCode(key);
    }
    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);
        int arrayIndex = hashCode % buckets;

        arrayIndex = arrayIndex < 0 ? arrayIndex * -1 : arrayIndex;

        return arrayIndex;
    }
    public void set(K key, V value) {
        int index = getBucketIndex(key);
        int hashcode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(index);

        HashNode<K, V> newNode = new HashNode<>(key, value, hashcode);

        if (head == null) {
            bucketArray.set(index, newNode);
            size++;
        } else {
            if(!this.keys().contains(key)) {
                newNode.setNext(head.getNext());
                head.setNext(newNode);
                size++;
            }else{
               while (head!=null){
                   if(head.getKey().equals(key) && head.getHashCode().equals(hashcode)) {
                       head.setValue(value);
                       return;
                   }
                   head = head.getNext();
               }
            }

        }

        if ((1.0 * size) / buckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            buckets = 2 * buckets;
            size = 0;
            for (int i = 0; i < buckets; i++)
                bucketArray.add(null);

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    set(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }
    public V get(K key) {

        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K,V> head = bucketArray.get(bucketIndex);
        try {
            if (head.getNext() != null) {
                while (head != null) {
                    if (head.getKey().equals(key) && head.getHashCode() == hashCode)
                        return head.getValue();
                    head = head.getNext();
                }
            } else {
                return head.getValue();
            }
        }catch (Exception e){
            System.out.println("null");
        }
    return null;
    }
    public boolean contains(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);
        while (head != null) {
            if(head.getKey().equals(key)){
                return true;
            }
        }
        return false;
    }
    public List<String> keys(){
        List<String> allKeys = new ArrayList<>();
        for (int i = 0; i <bucketArray.size() ; i++) {
            HashNode<K, V> head = bucketArray.get(i);
            while (head != null) {
                allKeys.add(head.getKey().toString());
                head = head.getNext();
            }
        }
        return allKeys;
    }



}
