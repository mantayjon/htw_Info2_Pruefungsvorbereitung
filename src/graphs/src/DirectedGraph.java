import java.util.*;

public class DirectedGraph {

    private List<Integer>[] edges;
    Set<Integer> visited = new HashSet<>();

    public DirectedGraph(int n) {
        this.edges = new List[n];
        for (int i = 0; i < n; i++) {
            this.edges[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int target) { // your turn

        this.edges[source].add(target);
    }

    public int getNumVertices() { // your turn

        return this.edges.length;
    }


    public boolean connectedBfs(int from, int to) {

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
            queue.addAll(edges[current]);
        }
        return false;
    }

    public boolean connectedDfs(int from, int to) {
        return connectedDfsInner(from, to);
    }

    private boolean connectedDfsInner(int from, int to) {
        if (from == to) {
            return true;
        }
        for (int child : edges[from]) {
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
