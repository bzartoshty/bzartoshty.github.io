/**
 * COMP 182 - Hashing
 * Slides 31, 32, 34, 35, 42
 * Chaining map; non-null keys AND values. Null means missing. Replacements preserve size; keys must stay hash/equality stable.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MyHashMap<K,V> {
    private static final class Entry<K,V> {
        final K key;V value;
        Entry(K key,V value){this.key=key;this.value=value;}
    }
    private ArrayList<LinkedList<Entry<K,V>>> table;
    private final double maxLoad;
    private int size;
    public MyHashMap(){this(8,0.75);}
    public MyHashMap(int capacity,double maxLoad){
        if(capacity<1 || !Double.isFinite(maxLoad) || maxLoad<=0)
            throw new IllegalArgumentException("capacity/load");
        this.maxLoad=maxLoad;table=emptyTable(capacity);
    }
    private ArrayList<LinkedList<Entry<K,V>>> emptyTable(int capacity){
        ArrayList<LinkedList<Entry<K,V>>> result=new ArrayList<>(capacity);
        for(int i=0;i<capacity;i++)result.add(new LinkedList<>());
        return result;
    }
    public int indexOf(K key){return Math.floorMod(Objects.requireNonNull(key).hashCode(),table.size());}
    private Entry<K,V> find(K key){
        for(Entry<K,V> e:table.get(indexOf(key)))if(e.key.equals(key))return e;
        return null;
    }
    public V get(K key){Entry<K,V> e=find(key);return e==null?null:e.value;}
    public boolean containsKey(K key){return find(key)!=null;}
    public V put(K key,V value){
        Objects.requireNonNull(key);Objects.requireNonNull(value);
        Entry<K,V> e=find(key);
        if(e!=null){V old=e.value;e.value=value;return old;}
        table.get(indexOf(key)).addFirst(new Entry<>(key,value));size++;
        while(size > table.size()*maxLoad)rehash(Math.addExact(Math.multiplyExact(table.size(),2),1));
        return null;
    }
    public V remove(K key){
        var iterator=table.get(indexOf(key)).iterator();
        while(iterator.hasNext()){
            Entry<K,V> e=iterator.next();
            if(e.key.equals(key)){iterator.remove();size--;return e.value;}
        }
        return null;
    }
    /** Explicit classroom rebuild; capacity may be any positive integer. */
    public void rehash(int capacity){
        if(capacity<1)throw new IllegalArgumentException("capacity");
        ArrayList<LinkedList<Entry<K,V>>> next=emptyTable(capacity);
        for(var bucket:table)for(Entry<K,V> e:bucket)
            next.get(Math.floorMod(e.key.hashCode(),capacity)).addFirst(e);
        table=next;
    }
    public int size(){return size;}
    public boolean isEmpty(){return size==0;}
    public int capacity(){return table.size();}
    public double loadFactor(){return (double)size/capacity();}
    public void clear(){for(var bucket:table)bucket.clear();size=0;}
    /** Independent list of keys in head-first bucket order. */
    public List<K> bucketKeys(int index){
        ArrayList<K> result=new ArrayList<>();
        for(Entry<K,V> e:table.get(index))result.add(e.key);
        return List.copyOf(result);
    }
}
