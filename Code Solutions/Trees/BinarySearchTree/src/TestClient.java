/**
 * This is a simple test client class
 * @author Nitinkumar Gove
 * @version 1.0
 *
 */ 
public class TestClient {
	public static void main(String cls[]){
		
		Tree tree = new Tree();
		
		/* elements of tree */
		int [] elements = {7,5,4,6,9,8,10};
		
		/* insert dummy data into tree */
		for(int i=0; i<elements.length ; i++){
			tree.insert(elements[i]);
		}
		
		/* api code tests */
		System.out.println("Height of tree - " + tree.getBSTHeight(tree.getRoot()));
		System.out.println("Smallest Node - " + tree.getSmallestNode(tree.getRoot()));
		System.out.println("Largest Node - " + tree.getLargestNode(tree.getRoot()));
	}

}
