/**
 * COMP 182 - Hashing
 * Slides 9, 13
 * Equal separate key objects work in HashMap; FB and Ea demonstrate a String hash collision.
 */
import java.time.LocalDate;
import java.util.HashMap;
public class PersonKeyDemo {
    public static void main(String[] args) {
        PersonKey a = new PersonKey("Ada", "", "Lovelace", LocalDate.of(1815,12,10));
        PersonKey b = new PersonKey("Ada", "", "Lovelace", LocalDate.of(1815,12,10));
        HashMap<PersonKey,String> map = new HashMap<>();
        map.put(a, "mathematician");
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());
        System.out.println(map.get(b));
        System.out.println("FB".hashCode() == "Ea".hashCode());
        System.out.println("FB".equals("Ea"));
    }
}
