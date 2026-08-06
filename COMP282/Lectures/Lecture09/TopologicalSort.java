import java.util.*;
public class TopologicalSort<V> {
    private final List<V> vertices;
    private final List<List<Integer>> neighbors;
     LinkedList<V>visitedList = new LinkedList<>(); // used for Topological sort
    LinkedList<Integer> list = new LinkedList<>(); 

    public TopologicalSort(List<V> vertices, List<int[]> edges) {
        this.vertices = new ArrayList<>(vertices);
        this.neighbors = new ArrayList<>();

        for (int i = 0; i < vertices.size(); i++) {
            neighbors.add(new ArrayList<Integer>());
        }

        for (int[] edge : edges) {
            neighbors.get(edge[0]).add(edge[1]);
        }
    }

    public List<V> sort() {
        int[] inDegree = new int[vertices.size()];

        for (List<Integer> nextNeighbors : neighbors) {
            for (Integer neighbor : nextNeighbors) {
                inDegree[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        List<V> sortedVertices = new ArrayList<>();
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            sortedVertices.add(vertices.get(vertex));

            for (Integer neighbor : neighbors.get(vertex)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        if (sortedVertices.size() != vertices.size()) {
            throw new IllegalStateException("Topological sort requires a directed acyclic graph.");
        }

        return sortedVertices;
    }

    public void printSort() {
        System.out.println(sort());
    }
    
     public void topologicalSort() {
        // create an edge list


        Set<Integer> visitedList = new HashSet<>();
        while(visitedList.size()!=neighbors.size()) {
            for(int i=0;i<neighbors.size();i++) {

                if(!visitedList.contains(i)) {
                    List<Integer> nextNeighbor = neighbors.get(i);
                    if(nextNeighbor.size()==0) {
                        for(int j=0; j<neighbors.size();++j) {
                            nextNeighbor = neighbors.get(j);

                            if(nextNeighbor.contains(i))
                                nextNeighbor.remove(new Integer(i));
                        }
                        visitedList.add(i);

                        list.addFirst(i);
                        i=-1;
                    }
                }
            }
        }
                System.out.println(list);
    }
}
