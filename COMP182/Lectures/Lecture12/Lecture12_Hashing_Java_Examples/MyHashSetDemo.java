/**
 * COMP 182 - Hashing
 * Slides 43
 * Set uniqueness uses equals/hashCode, not reference identity.
 */
public class MyHashSetDemo {
    public static void main(String[] args) {
        MyHashSet<String> set=new MyHashSet<>();
        System.out.println(set.add("apple"));
        System.out.println(set.add(new String("apple")));
        System.out.println(set.add("pear"));
        System.out.println(set.contains("apple"));
        System.out.println(set.remove("apple"));
        System.out.println(set.remove("apple"));
        System.out.println(set.size());
    }
}
