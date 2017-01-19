/**
 * This class models the Node in Singly Linked List
 * @author Nitinkumar Gove
 * @version 1.0
 *
 */
public class Node {

	private int data;     /* data of the node */
	private Node next;    /* pointer to next node in list */

	
	public Node(){
		data = 0; 
		next = null;
	}
	
	public Node(int data){
		this.data = data;
		next = null;
	}

	/**
	 * function to get the data for the node
	 * @return returns the integer data
	 */
	public int getData() {
		return data;
	}
    
	/**
	 * function to set the data for the node
	 * @param data data to be set for the current node
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * function to get the next node for this node
	 * @return returns the node which is next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * set the next node for this node
	 * @param next next node that this node points to
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
	/**
	 * function to return the string representation of the node
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getData()+"";
	}
		
}
