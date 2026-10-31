import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContractDemo {
    static void useList(List<String> list) {
        list.add("Ada"); list.add("Lin"); list.add(1, "Mia");
        System.out.println(list.get(1) + " " + list.size());
    }
    public static void main(String[] args) {
        useList(new ArrayList<String>());
        useList(new LinkedList<String>());
    }
}
