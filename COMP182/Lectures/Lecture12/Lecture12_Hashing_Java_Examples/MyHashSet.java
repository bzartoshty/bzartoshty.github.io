/**
 * COMP 182 - Hashing
 * Slides 43
 * Non-null keys. One shared marker; follows the displayed two-lookup update outline.
 */
public class MyHashSet<E> {
    private static final Object PRESENT=new Object();
    private final MyHashMap<E,Object> map=new MyHashMap<>();
    public boolean add(E key){
        boolean wasPresent=map.containsKey(key);
        map.put(key,PRESENT);
        return !wasPresent;
    }
    public boolean contains(E key){return map.containsKey(key);}
    public boolean remove(E key){
        boolean wasPresent=map.containsKey(key);
        map.remove(key);
        return wasPresent;
    }
    public int size(){return map.size();}
    public boolean isEmpty(){return map.isEmpty();}
    public void clear(){map.clear();}
}
