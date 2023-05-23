package tasks;

import java.util.List;

/**
 * Subclass holding the data.
 * @author n-c0de-r
 * @param <T> Generic type.
 */
public class TreeNode<T> {
	T data;
	TreeNode<T> parent;
	List<TreeNode<T>> children;
	/**
	 * Gets the data out of the node.
	 * @return	The generic type data.
	 */
	public T getData() {
		return data;
	}
	
	/**
	 * Gets a parent node holding this node.
	 * @return	A node type.
	 */
	public TreeNode<T> getParent() {
		return parent;
	}
	
	/**
	 * Gets a list of children nodes.
	 * @return	List of nodes.
	 */
	public List<TreeNode<T>> getChildren() {
		return children;
	}
	
	/**
	 * Sets the data of the node.
	 * @param data	Data to set.
	 */
	public void setData(T data) {
		this.data = data;
	}
	
	/**
	 * Reconnects this node to another parent.
	 * @param parent	Node to hold this child.
	 */
	public void setParent(TreeNode<T> parent) {
		this.parent = parent;
	}
	
	/**
	 * Change the list of children ot this node.
	 * @param children	The list of children to add.
	 */
	public void setData(List<TreeNode<T>> children) {
		this.children = children;
	}
}