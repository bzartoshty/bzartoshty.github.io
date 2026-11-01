/**
 * COMP 182 - Hashing
 * Slides 31, 32, 33, 34
 * Reproduces both chaining tables; configured load threshold 3 permits load 2.1 without resizing.
 */
public class ChainingDemo {
    public static void main(String[] args) {
        MyHashMap<Integer,String> map=new MyHashMap<>(10,3.0);
        for(int key:new int[]{10,22,86,12,42}){
            map.put(key,"value "+key);
            System.out.println(key+" bucket "+map.indexOf(key)+": "+map.bucketKeys(map.indexOf(key)));
        }
        map.remove(12);System.out.println("After removing 12: "+map.bucketKeys(2));
        System.out.println("Old value for 42: "+map.put(42,"updated"));
        System.out.println("Size after replacement: "+map.size());
        MyHashMap<Integer,Integer> many=new MyHashMap<>(10,3.0);
        int[][] chains={{10},{71,31},{42,12,22,2},{63,73},{},
            {75,5,65,95},{86},{27,47},{88,18,38,98},{99}};
        for(int[] chain:chains)for(int i=chain.length-1;i>=0;i--)many.put(chain[i],chain[i]);
        System.out.println("Count: "+many.size()+", load: "+many.loadFactor());
        for(int i=0;i<many.capacity();i++)System.out.println(i+": "+many.bucketKeys(i));
    }
}
