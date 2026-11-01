import java.util.*;
public class EqualityDemo {
    public static void main(String[] args) {
        StudentKey a = new StudentKey("S101"), b = new StudentKey("S101");
        Set<StudentKey> students = new HashSet<>();
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());
        System.out.println(students.add(a));
        System.out.println(students.add(b));
        System.out.println(students.size());
    }
}
