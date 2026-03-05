import java.util.*;

public class TestLinkedHashSet {
  public static void main(String[] args) {
    // Create a linked hash set
    Set<Integer> set = new LinkedHashSet<>();
    
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
    for (Integer element: set)
      System.out.print(element + " ");
  }
} 