import java.sql.SQLOutput;

public class BinaryTreeTest {
    public static void main(String[] args) {

        BinaryTree<Integer> root = new BinaryTree<>(0, 1);
        BinaryTree<Integer> left1 = new BinaryTree<>(1, 2);
        BinaryTree<Integer> right2 = new BinaryTree<>(2, 3);
        BinaryTree<Integer> left13 = new BinaryTree<>(3, 4);
        BinaryTree<Integer> right13 = new BinaryTree<>(4, 5);
        BinaryTree<Integer> left24 = new BinaryTree<>(5, 6);
        BinaryTree<Integer> right24 = new BinaryTree<>(6, 7);
        BinaryTree<Integer> left35 = new BinaryTree<>(7, 8);

        root.add(left1);
        root.add(right2);
        root.add(left13);
        root.add(right13);
        root.add(left24);
        root.add(right24);
        root.add(left35);

        /*
        root.addChildLeft(left1);
        root.addChildRight(right2);
        left1.addChildLeft(left13);
        left1.addChildRight(right13);
        right2.addChildLeft(left24);
        right2.addChildRight(right24);
        left13.addChildLeft(left35);
        */

        System.out.println("key " + left24.getKey());
        System.out.println("height "+ root.height());
        System.out.println("size " + root.size());
        System.out.println("find value " + root.find(3).getValue());
        System.out.println("max Int in arr "+ root.max());


    }
}
