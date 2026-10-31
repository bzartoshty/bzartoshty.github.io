public class SinglyLinkedDemo {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.addLast("A"); list.addLast("C"); list.add(1, "B");
        System.out.println(list); // [A, B, C]
        System.out.println(list.remove(1)); // B
        System.out.println(list.removeLast()); // C
        System.out.println(list.removeFirst()); // A
        list.checkInvariants();
        System.out.println("size=" + list.size() + " " + list); // size=0 []
        list.addFirst(null); list.addLast("X");
        for (String value : list) System.out.println(value); // null then X
        list.checkInvariants();
    }
}
