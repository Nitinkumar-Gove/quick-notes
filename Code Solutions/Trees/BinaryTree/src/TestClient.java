/**
 * This class models the behaviour of a test client. 
 * @author Nitinkumar Gove
 * @version 1.0
 */
public class TestClient {
	static Tree tree = new Tree();
	
	public static void main(String cla[]){
				
		tree.displayNodeCount();
		
		testAddNodes(5);
		
		tree.displayNodeCount();
		
		// testGetTreeHeight(tree.getRoot());
		// testPrintPreOrder(tree.getRoot());
		// testPrintInOrder(tree.getRoot());
		// testPrintPostOrder(tree.getRoot());	
		
		testPrintInLevelOrder(tree.getRoot());
		tree.searchTree(tree.getRoot(), "2");
	}
	
	// test function to add nodes to the 
	public static void testAddNodes(int nodeCount){
		for(int i=1;i<=nodeCount;i++){
			tree.insertNode(Integer.toString(i));
		}		
	}
	
	// test function to print tree
	public static void testPrintPreOrder(Node root){
		tree.printTree(root);
	}
	
	// test function to print tree - in order
	public static void testPrintInOrder(Node root){
		tree.printTreeInOrder(root);
	}
	
	// test function to print tree - post order
	public static void testPrintPostOrder(Node root){
		tree.printTreePostOrder(root);
	}
	
	// test functionto print tree - level order
	public static void testPrintInLevelOrder(Node root){
		tree.printTreeInLevelOrder(root);
	}
	
	// test function to get height of the tree
	public static void testGetTreeHeight(Node root){
		System.out.println("Tree Height : "+tree.getTreeHeight(root));
	}
	
	
}
