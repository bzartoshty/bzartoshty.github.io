/**
 * COMP 182 - Hashing
 * Slides 19, 20, 35
 * Continues beyond a tombstone before replacing an existing equal key; tests reuse and growth.
 */
public class TombstoneMapDemo {
    public static void main(String[] args) {
        LinearProbingMap<Integer,String> map=new LinearProbingMap<>(8);
        map.put(1,"one");map.put(9,"nine");map.put(17,"seventeen");
        map.remove(1);
        System.out.println("17 after deletion: "+map.get(17));
        System.out.println("replaced: "+map.put(17,"updated"));
        System.out.println("size after replacement: "+map.size());
        map.put(25,"twenty-five");
        System.out.println("tombstones after reuse: "+map.tombstones());
        map.remove(9);map.compact();
        System.out.println("tombstones after compact: "+map.tombstones());
        for(int i=0;i<100;i++)map.put(i,"v"+i);
        System.out.println("get 99 after growth: "+map.get(99));
    }
}
