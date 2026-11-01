import java.util.*;
public class MultimapDemo {
    public static Map<String,Set<String>> enrollments() {
        Map<String,Set<String>> courses = new TreeMap<>();
        add(courses,"COMP182","Ada"); add(courses,"COMP182","Mia");
        add(courses,"COMP182","Ada"); add(courses,"COMP110","Ada");
        return courses;
    }
    public static void add(Map<String,Set<String>> map,String key,String value) {
        map.computeIfAbsent(key,k -> new TreeSet<>()).add(value);
    }
    public static void main(String[] args) {
        System.out.println(enrollments());
        System.out.println("Set values reject repeated enrollment; List values could retain it.");
    }
}
