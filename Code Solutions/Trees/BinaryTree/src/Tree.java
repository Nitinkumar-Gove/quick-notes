/**
 * This class models the Tree. 
 * @author Nitinkumar Gove
 * @version 1.0
 */
public class Tree {
	
	private Node root;
	private int nodeCount = 0;

	public Tree(Node root) {
		super();
		this.root = root;
		this.nodeCount = 0;
	}
	
	// function to get total no of nodes in tree
	public int getNodeCount(){
		return this.nodeCount;
	}
	
	// function to increament node count
	public void increamentNodeCount(){
		this.nodeCount++;
	}
	
	// consturctor to create an empty tree
	public Tree(){
		nodeCount = 0;
		emptyTree();
	}
	
	// function to get root of the tree
	public Node getRoot(){
		return this.root;
	}
	
	// function to check if the Tree is empty
	public boolean isEmpty(){
		return root == null ;
	}
	
	// function to remove all the nodes from Tree
	public void emptyTree(){
		this.root = null;
	}
	
	// function to create a node for a given data
	public Node getNodeFrom(String data){
		return new Node(data);
	}

	// function to insert a node into tree
	public void insertNode(String data){
		
		Node current = getNodeFrom(data);		
		if(isEmpty()){
			this.root = current;
			increamentNodeCount();
		}
		else{
			insertNodeHelper(data,root);			
		}
	}
	
	// function to insert node in tree - helper function
	private void insertNodeHelper(String data, Node node){
		
		if(node.getLeft() == null){
			// try insert -> left
			node.setLeft(new Node(data));
			increamentNodeCount();
		}
		else if(node.getRight() == null){
			// try insert -> right
			node.setRight(new Node(data));
			increamentNodeCount();
		}
		else{
			// try insert -> left sub tree
			insertNodeHelper(data, node.getLeft());
		}		
	}
	
	// function to print the tree - pre order - recursive
	public void printTree(Node node){		
		if(node == null){
			return;
		}
		System.out.println(node.getData());		
		// check if leaf
		if(node.isLeaf()){
			return;
		}				
		printTree(node.getLeft());
		printTree(node.getRight());
		
	}
	
	// function to print tree - in order - recursive
	public void printTreeInOrder(Node node){
		if(node == null){
			return;
		}		
		printTreeInOrder(node.getLeft());
		System.out.println(node.getData());
		printTreeInOrder(node.getRight());
		
	}
	
	// function to print tree - post order - recursive
	public void printTreePostOrder(Node node){
		if(node == null){
			return;
		}
		printTreePostOrder(node.getLeft());
		printTreePostOrder(node.getRight());
		System.out.println(node.getData());
	}
	
	// function to print tree - level order - recursive
	public void printTreeInLevelOrder(Node root){
		int height = getTreeHeight(root);
		for(int i=1;i<=height;i++)
			printTreeLevel(root, i);		
	}
	
	// function to print a given level of a tree
	public void printTreeLevel(Node node, int level){
		
		if(node==null){
			return;
		}
		
		if(level==1){
			System.out.println(node.getData() + " ");
		}
		else{
			printTreeLevel(node.getLeft(), level-1);
			printTreeLevel(node.getRight(), level-1);
		}
		
	}
	
	// function to get height of the tree
	public int getTreeHeight(Node root){
		if(root == null){
			return 0;
		}
		else{
			int lheight = getTreeHeight(root.getLeft());
			int rheight = getTreeHeight(root.getRight());
			
			if ( lheight > rheight)
				return(lheight+1);
			else
				return(rheight+1);
		}
	}
	
	// function to search tree for a key
	public void searchTree(Node root, String key){
		
		if(root == null){
			return;
		}
		if(root.getData().equalsIgnoreCase(key)){
			System.out.println("Key Found");
			return;
		}
		else{
			searchTree(root.getLeft(),key);
			searchTree(root.getRight(), key);			
		}		
	}
	
	// function to print total nodes in tree 
	public void displayNodeCount(){
		System.out.println("Node Count : "+getNodeCount());
	}
}
