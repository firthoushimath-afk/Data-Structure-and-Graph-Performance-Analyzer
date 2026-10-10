import java.util.*;

public class GraphManager {

    private Map<String, List<String>> graph;

    public GraphManager() {
        graph = new HashMap<>();
    }

    // Add Vertex
    public void addVertex(String vertex) {

        if (graph.containsKey(vertex)) {
            System.out.println("Error: Vertex Already Exists");
            return;
        }

        graph.put(vertex, new ArrayList<>());

        System.out.println("Vertex Added Successfully!");
    }

    // Add Edge
    public void addEdge(String source, String destination) {

        if (!graph.containsKey(source) ||
                !graph.containsKey(destination)) {

            System.out.println("Error: Vertex Not Found");
            return;
        }

        graph.get(source).add(destination);
        graph.get(destination).add(source);

        System.out.println("Edge Added Successfully!");
    }

    // Display Graph
    public void displayGraph() {

        if (graph.isEmpty()) {

            System.out.println("Graph is Empty");

            return;
        }

        System.out.println("\nGraph Structure:");

        for (String vertex : graph.keySet()) {

            System.out.println(
                    vertex + " -> " + graph.get(vertex));
        }
    }

    // BFS
    public void bfs(String start) {

        if (!graph.containsKey(start)) {

            System.out.println("Vertex Not Found");

            return;
        }

        Set<String> visited = new HashSet<>();

        Queue<String> queue = new LinkedList<>();

        visited.add(start);

        queue.add(start);

        System.out.println("\nBFS Traversal:");

        while (!queue.isEmpty()) {

            String current = queue.poll();

            System.out.print(current + " ");

            for (String neighbour : graph.get(current)) {

                if (!visited.contains(neighbour)) {

                    visited.add(neighbour);

                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
    }

    // DFS
    public void dfs(String start) {

        if (!graph.containsKey(start)) {

            System.out.println("Vertex Not Found");

            return;
        }

        Set<String> visited = new HashSet<>();

        System.out.println("\nDFS Traversal:");

        dfsRecursive(start, visited);

        System.out.println();
    }

    private void dfsRecursive(
            String current,
            Set<String> visited) {

        visited.add(current);

        System.out.print(current + " ");

        for (String neighbour : graph.get(current)) {

            if (!visited.contains(neighbour)) {

                dfsRecursive(neighbour, visited);
            }
        }
    }
}