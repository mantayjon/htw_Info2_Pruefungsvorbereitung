public class BinarySearchTreeTest {
    public static void main(String[] args) {

        BinarySearchTree<Integer> n1 = new BinarySearchTree<>(14,32);
        BinarySearchTree<Integer> n2 = new BinarySearchTree<>(113,32);

        n1.addNode(n2);
        System.out.println(n1.size());

    }
}
