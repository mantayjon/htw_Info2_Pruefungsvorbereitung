public class DirectedGraphTest {
    public static void main(String[] args) {

        DirectedGraph g = new DirectedGraph(4);


        g.addEdge(0,2);
        g.addEdge(2,3);

        System.out.println(g.connectedBfs(0,2));
        System.out.println(g.connectedDfs(0,2));
    }
}
