/**
 * This class models the Node in Binary Tree.
 * @author Nitinkumar Gove
 * @version 1.0
 */
public class Node {
	private String data;
	private Node left;
	private Node right;
	
	public Node(String data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;		
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}	
	
	public boolean isLeaf(){
		if(this.getLeft()==null && this.getRight() == null){
			return true;
		}
		else 
			return false;
	}
}
