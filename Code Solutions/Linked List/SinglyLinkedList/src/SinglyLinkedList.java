import java.util.Stack;

/**
 * This class models the actual singly linked list
 * @author Nitinkumar Gove
 * @version 1.0
 *
 */
public class SinglyLinkedList {
	private Node head;
	private Node tail;
	
	public SinglyLinkedList(){
		this.head = null;
		this.tail = null;
	}
	
	public SinglyLinkedList(Node head) {
		super();
		this.head = head;
		this.tail = null;
	}

	/**
	 * function to get head of the singly linked list
	 * @return head of the linked list
	 */
	public Node getHead() {
		return head;
	}
	
	/**
	 * function to set the head of the singly linked list
	 * @param head head of the linked list
	 */
	public void setHead(Node head) {
		this.head = head;
	}
	
	/**
	 * function to get the last node in the linked list
	 * @return 
	 */
	public Node getTail() {
		return tail;
	}
	
	/**
	 * function to set the last element in the linked list
	 * @param tail last element in the linked list
	 */
	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	/**
	 * function to add new node to the singly linked list
	 * @param data data for the new node
	 */
	public void addNode(int data){
		
		/* handle base case */
		if(getHead()==null){
			setHead(new Node(data));
			setTail(getHead());
			return;
		}	
		
		Node traverse = getHead();
		while(traverse.getNext()!=null)
			traverse = traverse.getNext();
		
		traverse.setNext(new Node(data));
		setTail(traverse.getNext());					
	}
	
	/**
	 * function to add node at the start of the linked list
	 * @param data data for the node to be added
	 */
	public void addFirst(int data){
		Node temp = new Node(data);
		temp.setNext(getHead().getNext());
		getHead().setNext(temp);		
	}
	
	/**
	 * function to find the length of the singly linked list
	 * @param head head of the list
	 * @return length of the list , 0 if empty
	 */
	public int getLength(Node head){
		if(head == null){
			return 0;
		}
		int length = 1;
		Node temp = head.getNext();
		while(temp!=null){
			temp = temp.getNext();
			length++;
		}
		return length;
	}
	
	/**
	 * funtion to find data in the singly linked list
	 * @param data data to be searched in list
	 * @return true if data found , else false
	 */
	public boolean findNode(int data){
		boolean found = false;
		
		/* base case */
		if(this.getHead() == null){
			return found;
		}
		else{
			Node temp = this.getHead();
			while(temp!=null){
				if(temp.getData()==data){
					found = true;
					break;
				}
				temp = temp.getNext();
			}
		}		
		return found;
	}
	
	/**
	 * function to delete a node from the list
	 * @param data data for the node to be deleted
	 */
	public void deleteNode(int data){
		
		/* base case */
		if(this.getHead()==null){
			return;
		}
		else{
			/* check if its the first node */
			if(this.getHead().getData() == data){
				/* check if this is the only node in list */
				if( this.getHead().getNext() == null ){
					this.setHead(null);
				}
				else{
					this.setHead(this.getHead().getNext());
				}
			}
			else{
				/* look for the element in the list */
				Node curr = this.getHead().getNext();
				Node prev = this.getHead();
				
				while(curr!=null){
					if(curr.getData() == data ){
						prev.setNext(curr.getNext());
						break;
					}
					prev = curr;
					curr = curr.getNext();					
				}
			}			
		}		
	}
	
	/**
	 * function to print the complete singly linked list
	 */
	public void printList(){
		Node traverse = getHead();
		/* code to traverse the list */
		while(traverse!=null){
			System.out.print(traverse.getData() + " ");
			traverse = traverse.getNext();
		}
		System.out.println("");		    
	}
	
	/**
	 * function to print a singly linked list in reverse order
	 */
	public void printListInReverse(){
		
		/* base case */
		if(this.getHead()==null){
			System.out.println("List is empty");
			return;
		}
		
		Stack<Node> liststack = new Stack<Node>();
		Node start = this.getHead();
		
		while(start!=null){
			liststack.push(start);
			start = start.getNext();
		}
		
		while(!liststack.empty())
			System.out.print(liststack.pop() + " ");
	}

}
