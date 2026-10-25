public class TestMyHashSet {
    public static void main(String[] args) {
        MySet<String> names = new MyHashSet<>();
        System.out.println(names.add("Ada"));
        System.out.println(names.add(new String("Ada")));
        System.out.println(names.size());
        System.out.println(names.contains("Ada"));
        System.out.println(names.remove("Ada"));
        System.out.println(names.isEmpty());
    }
}
