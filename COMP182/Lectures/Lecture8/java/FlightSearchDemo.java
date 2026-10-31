import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/** Slides 15-21. Directed reachability with the lecture's neighbor order. */
public final class FlightSearchDemo {
    private static final class Frame {
        final String city;
        final Iterator<String> neighbors;
        Frame(String city, Map<String, List<String>> graph) {
            this.city = city;
            neighbors = graph.getOrDefault(city, Collections.emptyList()).iterator();
        }
    }
    public static Map<String, List<String>> lectureGraph() {
        Map<String, List<String>> graph = new LinkedHashMap<>();
        graph.put("P", Arrays.asList("R", "W"));
        graph.put("Q", Arrays.asList("X"));
        graph.put("R", Arrays.asList("X"));
        graph.put("S", Arrays.asList("T"));
        graph.put("T", Arrays.asList("W"));
        graph.put("W", Arrays.asList("S", "Y"));
        graph.put("X", Collections.emptyList());
        graph.put("Y", Arrays.asList("R", "Z"));
        graph.put("Z", Collections.emptyList());
        return graph;
    }
    public static List<String> iterativeRoute(Map<String, List<String>> graph, String origin, String destination) {
        requireCities(graph, origin, destination);
        Deque<Frame> stack = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        visited.add(origin);
        stack.push(new Frame(origin, graph));
        while (!stack.isEmpty()) {
            Frame frame = stack.peek();
            if (frame.city.equals(destination)) {
                List<String> path = new ArrayList<>();
                // push uses the front, so descendingIterator reads bottom to top.
                Iterator<Frame> frames = stack.descendingIterator();
                while (frames.hasNext()) path.add(frames.next().city);
                return path;
            }
            if (!frame.neighbors.hasNext()) stack.pop();
            else {
                String next = frame.neighbors.next();
                if (visited.add(next)) stack.push(new Frame(next, graph));
            }
        }
        return Collections.emptyList();
    }
    public static boolean recursiveReachable(Map<String, List<String>> graph, String origin, String destination) {
        requireCities(graph, origin, destination);
        return search(graph, origin, destination, new HashSet<>());
    }
    private static boolean search(Map<String, List<String>> graph, String city, String destination, Set<String> visited) {
        visited.add(city);
        if (city.equals(destination)) return true;
        for (String next : graph.getOrDefault(city, Collections.emptyList()))
            if (!visited.contains(next) && search(graph, next, destination, visited)) return true;
        return false;
    }
    private static void requireCities(Map<String, List<String>> graph, String origin, String destination) {
        if (!graph.containsKey(origin) || !graph.containsKey(destination))
            throw new IllegalArgumentException("origin and destination must be graph keys");
    }
    public static void main(String[] args) {
        Map<String, List<String>> graph = lectureGraph();
        System.out.println("P to Z route: " + iterativeRoute(graph, "P", "Z"));
        System.out.println("Q to Z route: " + iterativeRoute(graph, "Q", "Z"));
        System.out.println("Recursive P to Z: " + recursiveReachable(graph, "P", "Z"));
        System.out.println("Recursive Q to Z: " + recursiveReachable(graph, "Q", "Z"));
    }
}
