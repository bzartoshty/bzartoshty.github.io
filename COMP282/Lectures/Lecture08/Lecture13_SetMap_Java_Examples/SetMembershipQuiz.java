import java.util.*;
public class SetMembershipQuiz {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        System.out.println(s.add(28));
        System.out.println(s.add(78));
        System.out.println(s.add(28));
        System.out.println(s.size());
    }
}
