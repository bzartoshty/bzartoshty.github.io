import java.util.*;
/** Non-null teaching set backed by our separate-chaining map. */
public class MyHashSet<E> implements MySet<E> {
    private static final Object PRESENT = new Object();
    private final MyHashMap<E,Object> map;
    public MyHashSet() { map = new MyHashMap<>(); }
    public MyHashSet(int capacity) { map = new MyHashMap<>(capacity); }
    public MyHashSet(int capacity, double maxLoad) { map = new MyHashMap<>(capacity,maxLoad); }
    public boolean add(E e) { return map.put(e,PRESENT) == null; }
    public boolean remove(E e) { return map.remove(e) != null; }
    public boolean contains(E e) { return map.containsKey(e); }
    public int size() { return map.size(); }
    public boolean isEmpty() { return map.isEmpty(); }
    public void clear() { map.clear(); }
    /** Iterates an unmodifiable key snapshot; remove is unsupported. */
    public Iterator<E> iterator() { return map.keySet().iterator(); }
}
