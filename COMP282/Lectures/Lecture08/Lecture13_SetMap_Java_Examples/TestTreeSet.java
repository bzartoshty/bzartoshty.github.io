import java.util.*;
public class TestTreeSet {
   public static void main(String[] args) {
      NavigableSet<Integer> numbers = new TreeSet<>();
   
      // Add elements (TreeSet automatically stores them sorted: [10, 20, 30, 40])
      numbers.add(40);
      numbers.add(10);
      numbers.add(30);
      numbers.add(20);
   
      System.out.println("TreeSet elements: " + numbers);
   
      // Case 1: The exact number does not exist in the set
      // It looks for the next higher number.
      Integer ceil1 = numbers.ceiling(25); 
      System.out.println("Ceiling for 25: " + ceil1); // Output: 30
   
      // Case 2: The exact number already exists in the set
      // It returns the number itself because the method is inclusive (greater than OR EQUAL TO).
      Integer ceil2 = numbers.ceiling(20); 
      System.out.println("Ceiling for 20: " + ceil2); // Output: 20
   
      // Case 3: The number is higher than anything in the set
      // There is no element greater than or equal to 50, so it returns null.
      Integer ceil3 = numbers.ceiling(50); 
      System.out.println("Ceiling for 50: " + ceil3); // Output: null
      Set<String> insensitive = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
      System.out.println(insensitive.add("Ada"));
      System.out.println(insensitive.add("ADA"));
   }
}
