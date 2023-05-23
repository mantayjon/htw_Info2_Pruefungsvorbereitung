import java.util.HashMap;
import java.util.Map;

public class WeightedGraph {
    // edges: array of maps
    // edges[i]: map
    // key: id of a neighbor of vertex i
    // value: weight of the edge

    private  Map<Integer, Integer>[] edges;

    public WeightedGraph(int n) {
        edges = new Map[n];
        for (int i = 0; i < n; i++) {
            edges[i] = new HashMap<>(); }
    }

// other parts ignored ...
}
