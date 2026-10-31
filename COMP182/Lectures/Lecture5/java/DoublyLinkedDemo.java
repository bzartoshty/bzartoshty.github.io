public class DoublyLinkedDemo {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.addFirst("B"); list.addFirst("A"); list.addLast("D"); list.add(2, "C");
        System.out.println(list); // [A, B, C, D]
        System.out.println(list.reverseString()); // [D, C, B, A]
        System.out.println(list.remove(1)); // B
        System.out.println(list); // [A, C, D]
        System.out.println(list.reverseString()); // [D, C, A]
        list.removeFirst(); list.removeLast(); list.removeLast();
        list.checkInvariants();
        System.out.println("size=" + list.size() + " " + list); // size=0 []
    }
}
