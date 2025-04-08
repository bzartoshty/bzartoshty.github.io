import java.util.*;

public class TestHashSet {
  public static void main(String[] args) {
    // Create a hash set
    Set<Integer> set = new HashSet<>(4,0.5f);

    // Add strings to the set
    set.add(10);
    set.add(102);
    set.add(5);
    set.add(202);
    set.add(102);
    set.add(45);
    set.add(65);

    System.out.println(set);

    // Display the elements in the hash set
    for (Integer s: set) {
      System.out.print(s + " ");
    }
    
    // Process the elements using a forEach method
    System.out.println();
    set.forEach(e -> System.out.print(e+ " "));
  }
}