/**
 * This class models the client class behaviour
 * @author Nitinkumar Gove
 * @version 1.0
 *
 */
public class Client {
	
	public static void main(String args[]){
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		for(int i = 0 ; i<10;i++)
			list.addNode(i*10);
		
		list.printList();
		
		list.addFirst(5);		
		list.printList();
		
		System.out.println("Last Node - " + list.getTail().getData());
		System.out.println("List Length - " + list.getLength(list.getHead()));
		System.out.println("50 Present - " + list.findNode(500));
		
		list.deleteNode(60);
		list.printList();
		
		list.deleteNode(0);
		list.printList();
		
		list.deleteNode(20);
		list.printList();
		
		list.printListInReverse();
	}

}
