import java.util.*;
/** Teaching API: non-null keys/values; collection methods return snapshots. */
public interface MyMap<K,V> {
    void clear();
    boolean containsKey(K key);
    boolean containsValue(V value);
    V get(K key);
    V put(K key, V value);
    V remove(K key);
    int size();
    boolean isEmpty();
    Set<K> keySet();
    Collection<V> values();
    Set<Map.Entry<K,V>> entrySet();
}
