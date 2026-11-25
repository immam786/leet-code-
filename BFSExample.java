import java.util.*;

public class BFSExample {

    public static List<String> bfs(Map<String, List<String>> graph, String start) {

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        List<String> traversalOrder = new ArrayList<>();

        visited.add(start);
        queue.offer(start);

        while (!queue.isEmpty()) {
            String node = queue.poll();
            traversalOrder.add(node);

            for (String neighbour : graph.getOrDefault(node, Collections.emptyList())) {

                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.offer(neighbour);
                }
            }
        }

        return traversalOrder;
    }

    public static void main(String[] args) {

        Map<String, List<String>> SampleGraph = new HashMap<>();

        SampleGraph.put("A", Arrays.asList("B", "C"));
        SampleGraph.put("B", Arrays.asList("A", "D", "E"));
        SampleGraph.put("C", Arrays.asList("A", "F"));
        SampleGraph.put("D", Collections.singletonList("B"));
        SampleGraph.put("E", Collections.singletonList("B"));
        SampleGraph.put("F", Collections.singletonList("C"));

        List<String> result = bfs(SampleGraph, "A");

        System.out.println(result);
    }
}