/**
 * COMP 182 - Hashing
 * Slides 16, 19, 20, 25, 28, 30
 * Fixed capacity tracing set. No automatic resize. All searches bounded by capacity; index -1 means insertion failure.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public final class ProbeTable {
    public enum Mode { LINEAR, QUADRATIC, DOUBLE_PRIME, DOUBLE_LEGACY }
    public record Result(boolean inserted, int index, List<Integer> probes) { }
    private static final byte EMPTY=0, LIVE=1, DELETED=2;
    private final Integer[] keys;
    private final byte[] state;
    private final Mode mode;
    private final int q;
    private int size;
    public ProbeTable(int capacity, Mode mode, int q) {
        if (capacity < 1) throw new IllegalArgumentException("capacity");
        this.mode = Objects.requireNonNull(mode);
        if (mode == Mode.DOUBLE_PRIME &&
                (!isPrime(capacity) || !isPrime(q) || q >= capacity))
            throw new IllegalArgumentException("Need primes q < capacity");
        keys = new Integer[capacity]; state = new byte[capacity]; this.q=q;
    }
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int d=2; d<=n/d; d++) if(n%d==0)return false;
        return true;
    }
    public int home(int key) { return Math.floorMod(key, keys.length); }
    public int step(int key) {
        if (mode == Mode.DOUBLE_LEGACY) {
            if(key<0)throw new IllegalArgumentException("Legacy demo uses nonnegative keys");
            return 1 + ((key / 10) % 9);
        }
        return mode == Mode.DOUBLE_PRIME ? q - Math.floorMod(key,q) : 1;
    }
    public int probe(int key, int attempt) {
        if(attempt<0 || attempt>=keys.length)throw new IllegalArgumentException("attempt");
        long offset = mode == Mode.QUADRATIC ? (long) attempt * attempt
            : (long) attempt * step(key);
        return (int) Math.floorMod(home(key) + offset, (long) keys.length);
    }
    public Result insert(int key) {
        ArrayList<Integer> probes=new ArrayList<>();int firstDeleted=-1;
        for(int i=0;i<keys.length;i++){
            int j=probe(key,i);probes.add(j);
            if(state[j]==LIVE && keys[j]==key)
                return new Result(false,j,List.copyOf(probes));
            if(state[j]==DELETED && firstDeleted<0)firstDeleted=j;
            if(state[j]==EMPTY){
                int target=firstDeleted>=0?firstDeleted:j;
                keys[target]=key;state[target]=LIVE;size++;
                return new Result(true,target,List.copyOf(probes));
            }
        }
        if(firstDeleted>=0){
            keys[firstDeleted]=key;state[firstDeleted]=LIVE;size++;
            return new Result(true,firstDeleted,List.copyOf(probes));
        }
        return new Result(false,-1,List.copyOf(probes));
    }
    private int find(int key) {
        for(int i=0;i<keys.length;i++){
            int j=probe(key,i);
            if(state[j]==EMPTY)return -1;
            if(state[j]==LIVE && keys[j]==key)return j;
        }
        return -1;
    }
    public boolean contains(int key) { return find(key)>=0; }
    public boolean remove(int key) {
        int j=find(key);if(j<0)return false;
        keys[j]=null;state[j]=DELETED;size--;return true;
    }
    public int size() { return size; }
    public int capacity() { return keys.length; }
    public Map<Integer,Integer> slots() {
        TreeMap<Integer,Integer> result=new TreeMap<>();
        for(int i=0;i<keys.length;i++)if(state[i]==LIVE)result.put(i,keys[i]);
        return result;
    }
}
