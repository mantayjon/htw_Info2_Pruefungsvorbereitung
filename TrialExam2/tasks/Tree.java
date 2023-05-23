package tasks;

import java.util.ArrayList;

/**
 * A basic tree implementation
 * @author n-c0de-r
 * @param <T> Generic type.
 */
public class Tree<T> {
	private TreeNode<T> root;

	public Tree(T rootData) {
		root = new TreeNode<T>();
		root.data = rootData;
		root.children = new 
		ArrayList<TreeNode<T>>();
	}
	
	/**
	 * Get the root of the tree.
	 * @return	Node, sub-root.
	 */
	public TreeNode<T> getRoot() {
		return root;
	}
	
	/**
	 * Set a root to this tree, if necessary.
	 * @param root	The node to set.
	 */
	public void setRoot(TreeNode<T> root) {
		this.root = root;
	}
	
	// Your codes start here
	
	// EASY TASKS
	
	/**
	 * Adding a child node to a specific parent node:
	 * @param parent	Parent node.
	 * @param data		Data to store in the node.
	 */
	public void addChild(TreeNode<T> parent, T data) {
		TreeNode<T> child = new TreeNode<T>();
		child.data = data;
		child.parent = parent;
		
		/*Some parts are missing here.*/
	}
	
	/**
	 * Removing a specific leaf node.
	 * @param leaf	Leaf to remove.
	 */
	public void removeLeaf(TreeNode<T> leaf) {
		if(leaf.children.size() == 0) {
			
			/*Some parts are missing here.*/
		}
		
		/*Some parts are missing here.*/
	}
	
	// MEDIUM TASKS:
	
	/**
	 * Searching for a specific node using breadth-first search.
	 * @param data	Data to find.
	 * @return		Node containing the found data.
	 */
	public TreeNode<T> search(T data) {
		Queue<TreeNode<T>> queue = new LinkedList<TreeNode<T>>();
		queue.add(root);
		
		/*Some parts are missing here.*/
		
		return null;
	}
	
	/**
	 * Getting the height of the tree. Recursively.
	 * @param node	The node to check.
	 * @return		Height of the tree.
	 */
	public int getHeight(TreeNode<T> node) {
		if (node == null) {
			return -1;
		}
		
		/*Some parts are missing here.*/
	}
	
	/**
	 * Getting the number of leaf nodes. Recursively.
	 * @param node	Node to check
	 * @return		Final number of leafs.
	 */
	public int getNumberOfLeaves(TreeNode<T> node) {
		
		/*Some parts are missing here.*/
		
		return numberOfLeaves;
	}
	
	// HARD TASKS
	
	/**
	 * Checking if the tree is a binary search tree.
	 * @param node	Node To check.
	 * @return		Final boolean result.
	 */
	public boolean isBST(TreeNode<T> node) {
		// Your codes go here
	}
	
	// Your codes end here
}