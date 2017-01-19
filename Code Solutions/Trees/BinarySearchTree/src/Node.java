/**
 * This class models the 'node' in a binary search tree
 * @author Nitinkumar Gove
 * @version 1.0
 */

public class Node {
	
	private int data;
	private Node left;
	private Node right;	
	
	/**
	 * Constructor to initialize a node
	 * @param data - data for the node
	 */
	public Node(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null; 
	}
	
	/**
	 * function to retrieve the data for the calling node
	 * @return data - data associated with current, 'this', node
	 */
	public int getData() {
		return data;
	}
	
	/**
	 * function to set the data value for the calling node
	 * @param data - value to be set for the data
	 */
	public void setData(int data) {
		this.data = data;
	}
	
	/**
	 * function to get the reference to the left node
	 * @return left - reference to the left node , sub tree
	 */
	public Node getLeft() {
		return left;
	}
	
	/**
	 * function to attach a node/sub tree to the left of the calling node
	 * @param left - node reference to be associated with the left pointer
	 */
	public void setLeft(Node left) {
		this.left = left;
	}
	
	/**
	 * function to get the reference to the right node
	 * @return right - node reference associated with the right pointer
	 */
	public Node getRight() {
		return right;
	}
	
	/**
	 * function to attach the right/sub tree to the right of calling node
	 * @param right - node reference to be associated with the right pointer
	 */
	public void setRight(Node right) {
		this.right = right;
	}
	
	/**
	 * function to check if the node is a leaf node
	 * @return boolean - true/false
	 */
	public boolean isLeaf(){
		return this.getLeft() == null && this.getRight() == null;
	}

	/**
	 * function to get the string representation of the node
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String node= this.getData() + " ";
		
		if(this.getLeft()!=null){
			node += this.getLeft().getData()+" | ";
		}
		
		if(this.getRight()!=null){
			node += this.getRight().getData();
		}
		
		return node;
	}
	
	
	

}
