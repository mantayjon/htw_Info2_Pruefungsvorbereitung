package tests;

import static org.junit.Assert.*;
import org.junit.*;

import tasks.TreeNode;
import tasks.Tree;

public class AllTests {

    @Test
    public void testAddChild() {
    	Tree<Integer> tree = new Tree<>(1);
        TreeNode<Integer> root = tree.getRoot();
        tree.addChild(root, 2);
        assertEquals(1, root.getChildren().size());
        assertEquals(Integer.valueOf(2), root.getChildren().get(0).getData());
    }

    @Test
    public void testRemoveLeaf() {
    	Tree<Integer> tree = new Tree<>(1);
        TreeNode<Integer> root = tree.getRoot();
        tree.addChild(root, 2);
        TreeNode<Integer> leaf = root.getChildren().get(0);
        tree.removeLeaf(leaf);
        assertEquals(0, root.getChildren().size());
    }

    @Test
    public void testSearch() {
    	Tree<Integer> tree = new Tree<>(1);
        TreeNode<Integer> root = tree.getRoot();
        tree.addChild(root, 2);
        tree.addChild(root, 3);
        TreeNode<Integer> found = tree.search(3);
        assertEquals(Integer.valueOf(3), found.getData());
    }

    @Test
    public void testGetHeight() {
    	Tree<Integer> tree = new Tree<>(1);
        TreeNode<Integer> root = tree.getRoot();
        tree.addChild(root, 2);
        tree.addChild(root, 3);
        tree.addChild(root.getChildren().get(0), 4);
        int height = tree.getHeight(root);
        assertEquals(3, height);
    }

    @Test
    public void testGetNumberOfLeaves() {
    	Tree<Integer> tree = new Tree<>(1);
        TreeNode<Integer> root = tree.getRoot();
        tree.addChild(root, 2);
        tree.addChild(root, 3);
        tree.addChild(root.getChildren().get(0), 4);
        int numberOfLeaves = tree.getNumberOfLeaves(root);
        assertEquals(2, numberOfLeaves);
    }

    @Test
    public void testIsBST() {
        Tree<Integer> tree = new Tree<>(5);
        TreeNode<Integer> root = tree.getRoot();
        tree.addChild(root, 3);
        tree.addChild(root, 8);
        tree.addChild(root.getChildren().get(0), 1);
        tree.addChild(root.getChildren().get(0), 4);
        tree.addChild(root.getChildren().get(1), 7);
        tree.addChild(root.getChildren().get(1), 12);
        boolean result = tree.isBST(root);
        assertTrue(result);
    }

}
