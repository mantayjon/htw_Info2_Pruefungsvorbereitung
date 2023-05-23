import java.util.*;

public class WeightedDirectedGraph {
    // edges: array of maps
    // edges[i]: map
    // key: id of a neighbor of vertex i // value: weight of the edge

    private  Map<Integer, Integer>[] edges;

    public WeightedDirectedGraph(int n) {
        edges = new Map[n];
        for (int i = 0; i < n; i++) {
            edges[i] = new HashMap<>(); }
    }

    public void addWeightedEdge(int source, int target, int weight) { // your turn

         this.edges[source].put(target,weight);
    }

    public int getNumVertices() { // your turn
        return this.edges.length;
    }

    public boolean connectedBfs(int from, int to) {

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(from); // enqueue

        while (!queue.isEmpty()) {
            int current = queue.remove();
            if (current == to) {
                return true;
            }
            if (visited.contains(current)) {
                continue;
            }
            visited.add(current);
            queue.addAll(edges[current].keySet());
        }
        return false;
    }

    public boolean connectedDfs(int from, int to) {
        return connectedDfsInner(from, to);
    }

    private boolean connectedDfsInner(int from, int to) {
        Set<Integer> visited = new HashSet<>();
        if (from == to) {
            return true;
        }
        for (int child : edges[from].keySet()) {
            if (visited.contains(child)) {
                continue;
            }
            visited.add(child);
            if (connectedDfsInner(child, to)) {
                return true;
            }
        }
        return false;
    }


}