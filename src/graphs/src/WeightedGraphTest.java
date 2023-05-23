public class WeightedGraphTest {
    public static void main(String[] args) {

        WeightedDirectedGraph g = new WeightedDirectedGraph(10);

        g.addWeightedEdge(0,1,10);
        g.addWeightedEdge(1,2,10);
        g.addWeightedEdge(0,3,4);
        g.addWeightedEdge(3,2,9);

        System.out.println(g.getNumVertices());
        System.out.println(g.connectedBfs(0,2));
        System.out.println(g.connectedDfs(0,8));



    }
}
