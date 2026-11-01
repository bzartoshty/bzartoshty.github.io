/**
 * COMP 182 - Hashing
 * Slides 35, 42
 * Rebuild moves key 519 from index 9 to 13; automatic growth retains mappings.
 */
public class RehashingDemo {
    public static void main(String[] args) {
        MyHashMap<Integer,String> map=new MyHashMap<>(10,0.75);
        map.put(519,"stored value");
        System.out.println("Before: "+map.indexOf(519));
        map.rehash(23);
        System.out.println("After: "+map.indexOf(519));
        System.out.println("Value: "+map.get(519));
        System.out.println("Size: "+map.size());
        for(int i=0;i<100;i++)map.put(i,"v"+i);
        System.out.println("After automatic growth: "+map.size());
    }
}
