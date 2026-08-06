import java.util.*;
public class TestTopologicalSort {
   public static void main(String[] args) {
      Integer[] vertices = {0,1,2,3,4,5,6};
      ArrayList<Integer> v = new ArrayList<>(Arrays.asList(vertices));
      int[][] edges = {
           {0,1,1},{0,2,1},{0,5,1},
           {1,4,1},
           {3,2,1},{3,4,1},{3,5,1},
           {5,2,1},
           {6,4,1}
         };
      ArrayList<int[]> e = new ArrayList<>(Arrays.asList(edges));
      TopologicalSort<Integer> graph = new TopologicalSort(v,e);
      graph.sort();
      graph.printSort();
      graph.topologicalSort();
   }
}
