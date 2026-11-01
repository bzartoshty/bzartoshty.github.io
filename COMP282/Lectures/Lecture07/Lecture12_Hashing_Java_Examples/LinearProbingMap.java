/**
 * COMP 182 - Hashing
 * Slides 19, 20, 35
 * Non-null keys/values; null means missing. At most half live occupancy; bounded probes and tombstone compaction.
 */
import java.util.Arrays;
import java.util.Objects;

public class LinearProbingMap<K,V> {
    private static final byte EMPTY=0,LIVE=1,DELETED=2;
    private Object[] keys,values;
    private byte[] state;
    private int size,used;
    public LinearProbingMap(){this(8);}
    public LinearProbingMap(int capacity){
        if(capacity<2)throw new IllegalArgumentException("capacity >= 2");
        keys=new Object[capacity];values=new Object[capacity];state=new byte[capacity];
    }
    private int index(Object key,int attempt){
        return (int)(((long)Math.floorMod(key.hashCode(),capacity())+attempt)%capacity());
    }
    private int find(K key){
        Objects.requireNonNull(key);
        for(int i=0;i<capacity();i++){
            int j=index(key,i);
            if(state[j]==EMPTY)return -1;
            if(state[j]==LIVE && keys[j].equals(key))return j;
        }
        return -1;
    }
    @SuppressWarnings("unchecked")
    public V get(K key){int j=find(key);return j<0?null:(V)values[j];}
    public boolean containsKey(K key){return find(key)>=0;}
    @SuppressWarnings("unchecked")
    public V put(K key,V value){
        Objects.requireNonNull(key);Objects.requireNonNull(value);
        int j=find(key);
        if(j>=0){V old=(V)values[j];values[j]=value;return old;}
        if(size+1>capacity()/2)rebuild(Math.multiplyExact(capacity(),2));
        else if(used>capacity()*0.75)rebuild(capacity());
        insertNew(key,value);
        return null;
    }
    private void insertNew(Object key,Object value){
        int firstDeleted=-1;
        for(int i=0;i<capacity();i++){
            int j=index(key,i);
            if(state[j]==DELETED && firstDeleted<0)firstDeleted=j;
            if(state[j]==EMPTY){
                int target=firstDeleted>=0?firstDeleted:j;
                if(state[target]==EMPTY)used++;
                keys[target]=key;values[target]=value;state[target]=LIVE;size++;return;
            }
        }
        if(firstDeleted>=0){
            keys[firstDeleted]=key;values[firstDeleted]=value;state[firstDeleted]=LIVE;size++;return;
        }
        throw new IllegalStateException("No free slot");
    }
    @SuppressWarnings("unchecked")
    public V remove(K key){
        int j=find(key);if(j<0)return null;V old=(V)values[j];
        keys[j]=null;values[j]=null;state[j]=DELETED;size--;return old;
    }
    public void compact(){rebuild(capacity());}
    private void rebuild(int capacity){
        Object[] oldKeys=keys,oldValues=values;byte[] oldState=state;
        keys=new Object[capacity];values=new Object[capacity];state=new byte[capacity];size=used=0;
        for(int i=0;i<oldKeys.length;i++)if(oldState[i]==LIVE)insertNew(oldKeys[i],oldValues[i]);
    }
    public int size(){return size;}
    public boolean isEmpty(){return size==0;}
    public int capacity(){return keys.length;}
    public int tombstones(){return used-size;}
    public void clear(){Arrays.fill(keys,null);Arrays.fill(values,null);Arrays.fill(state,EMPTY);size=used=0;}
}
