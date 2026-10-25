/**
 * COMP 182 - Hashing
 * Slides 39, 40
 * Historical and OpenJDK-21 mixing excerpts; implementation details, not Map API guarantees.
 */
public class HashMixingExamples {
    static int legacyIndex(int h,int capacity){
        requirePowerOfTwo(capacity);
        h ^= (h >>> 20) ^ (h >>> 12);
        h = h ^ (h >>> 7) ^ (h >>> 4);
        int index = h & (capacity - 1);
        return index;
    }
    // OpenJDK 21 excerpt; this does not implement a complete HashMap.
    static final int hash(Object key) {
        int h;
        return (key == null) ? 0
            : (h = key.hashCode()) ^ (h >>> 16);
    }
    static int modernIndex(Object key,int n){
        requirePowerOfTwo(n);
        int index = (n - 1) & hash(key);
        return index;
    }
    private static void requirePowerOfTwo(int n){
        if(n<=0 || (n&(n-1))!=0)throw new IllegalArgumentException("power of two");
    }
    public static void main(String[] args) {
        for(int key:new int[]{0,1,-1,Integer.MIN_VALUE,0x12340000})
            System.out.println(key+": "+legacyIndex(key,16)+" / "+modernIndex(key,16));
        System.out.println("null hash: "+hash(null));
    }
}
