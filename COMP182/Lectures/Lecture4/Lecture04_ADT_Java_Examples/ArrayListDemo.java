public class ArrayListDemo {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>(new String[]{"A", "B", "C"});
        list.add(1, "X");
        System.out.println(list + " size=" + list.size() + " capacity=" + list.capacity());
        System.out.println("removed=" + list.remove(2));
        System.out.println(list + " size=" + list.size() + " capacity=" + list.capacity());
        list.add("D");
        list.add("E");
        System.out.println(list + " size=" + list.size() + " capacity=" + list.capacity());
        list.trimToSize();
        System.out.println("trimmed capacity=" + list.capacity());
    }
}
