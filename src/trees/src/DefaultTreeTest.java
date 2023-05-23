public class DefaultTreeTest {

    public static void main(String[] args) {

        DefaultTree<Integer> root = new DefaultTree<>(0, 6);
        DefaultTree<Integer> tree2 = new DefaultTree<>(1, 2);
        DefaultTree<Integer> tree3 = new DefaultTree<>(2, 5);
        DefaultTree<Integer> tree4 = new DefaultTree<>(3, 2);
        DefaultTree<Integer> tree5 = new DefaultTree<>(4, 5);


        root.addChild(tree2);
        root.addChild(tree3);
        tree2.addChild(tree4);
        tree4.addChild(tree5);


        System.out.println("size " + root.size());
        System.out.println("height " + root.height());
        System.out.println("key "+root.find(3).getKey()+" | value " + root.find(3).getValue());
    }
}
