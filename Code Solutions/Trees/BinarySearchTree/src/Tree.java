import java.util.ArrayList;

/**
 * This class models the binary search tree.
 * @author Nitinkumar Gove
 * @version 2.0
 *
 */
public class Tree {
	private Node root;

	public Tree(Node root) {
		super();
		this.root = root;
	}
	
	/**
	 * constructor to initialize a tree
	 * @param data data value for the root
	 */
	public Tree(int data){
		this.root = new Node(data);
	}
	
	public Tree(){
		this.root = null; 
	}
	
	/**
	 * function to check if the tree is empty
	 * @return boolean true / false
	 */
	public boolean isEmpty(){
		return this.root == null;
	}
	
	/**
	 * function to insert new data (node) in the tree
	 * @param data data to be inserted into the tree
	 */
	public void insert(int data){
		if(this.isEmpty()){
			this.root = new Node(data);
		}
		else
			insertNode(this.root, new Node(data));		
	}
	
	/**
	 * function to insert a new node in tree
	 * @param rootNode the start node 
	 * @param tempNode the node to be inserted
	 */
	private void insertNode(Node rootNode, Node tempNode){
		if(tempNode.getData()<rootNode.getData()){
			if(rootNode.getLeft() == null){
				rootNode.setLeft(tempNode);
			}
			else{
				insertNode(rootNode.getLeft(),tempNode);
			}				
		}
		else if(tempNode.getData() > rootNode.getData()){
			if(rootNode.getRight() == null){
				rootNode.setRight(tempNode);
			}
			else{
				insertNode(rootNode.getRight(),tempNode);
			}
		}		
	}
	
	/**
	 * function to print a tree in pre order
	 * @param root root node of the tree
	 */
	public void printTreePreOrder(Node root){
		if(root == null){
			return;
		}
		System.out.print(root.getData() + " | ");
		printTreePreOrder(root.getLeft());
		printTreePreOrder(root.getRight());
		
	}
	
	/**
	 * function to print tree in order
	 * @param root root of the tree to be printed
	 */
	public void printTreeInOrder(Node root){
		
		/* check if the node is empty*/
		if(root == null){
			return;
		}
		
		printTreeInOrder(root.getLeft());
		System.out.print(root.getData() + " | ");
		printTreeInOrder(root.getRight());
	}
	
	/**
	 *  function to get the string representation of the tree
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(!isEmpty()){
			return this.root.toString();
		}
		return "";
	}
	/**
	 * function to get the root of the tree
	 * @return root root of the tree
	 */
	public Node getRoot() {
		return root;
	}

	/**
	 * function to set the root of the tree
	 * @param root root of the tree
	 */
	public void setRoot(Node root) {
		this.root = root;
	}
	
	/**
	 * function to validate a binary search tree
	 * @param root root of the tree to be validated
	 * @param min min value allowed in the tree
	 * @param max max value allowed in the tree
	 * @return
	 */
	public boolean isBinarySearchTree(Node root, int min, int max){
		/* empty tree is a BST */
		if(root == null){
			return true;
		}
		
		/* check if this node violates the constraints*/
		if(root.getData() < min || root.getData() > max)
			return false;
		
		/* check same for the sub trees */
		return ( isBinarySearchTree(root.getLeft(), min, root.getData()-1) && 
				 isBinarySearchTree(root.getRight(), root.getData()+1, max));
	}
	
	/**
	 * function to get sorted list of all elements in a BST
	 * @param root root of the sub tree
	 * @param list list of the sorted elements
	 * @return list list with sorted elements
	 */
	public ArrayList<Integer> getSortedTree(Node root, ArrayList<Integer> list){
		if(root == null){
			return list;
		}
		
		getSortedTree(root.getLeft(),list);
		list.add(root.getData());
		getSortedTree(root.getRight(),list);
		return list;
	}
	
	/**
	 * function to find list of elements which add up to the given key value
	 * @param list list of elements in sorted order
	 * @param key key for which pair has to be found
	 */
	public ArrayList<Integer> findNodePair(ArrayList<Integer> list, int key){
		ArrayList<Integer>pair = new ArrayList<Integer>();
		
		int leftPointer = 0; 
		int rightPointer = list.size()-1;
		
		while(leftPointer < rightPointer){			
			int sum = list.get(leftPointer) + list.get(rightPointer);
			/* check for valid sum */
			if(sum < key)	leftPointer++;
			else if (sum > key)	rightPointer--;
			else{
				pair.add(leftPointer);
				pair.add(rightPointer);
				break;
			}				
		}
		
		return pair;
	}
	
	/**
	 * function to check if two trees are identical
	 * @param proot parent tree root
	 * @param sroot root of the subtree
	 * @return true/false
	 */
	public boolean areSame(Node proot, Node sroot){
		
		/* check base conditions */
		if(proot == null && sroot == null)
			return true;
		
		if(proot == null || sroot == null)
			return false;
		
		/* check if the left and right subtrees are same */
		return ( proot.getData() == sroot.getData() && 
				 areSame(proot.getLeft(), sroot.getLeft()) &&
				 areSame(proot.getRight(), sroot.getRight()));
		
	}
	
	/**
	 * function to check if a given tree is a subtree of other tree
	 * @param proot root of the parent tree
	 * @param sroot root of the subtree
	 * @return true/false
	 */
	public boolean isSubtree(Node proot, Node sroot){
		
		/* a null tree is a sub tree */
		if(sroot == null){
			return true;
		}
		
		/* return false if parent tree is empty */
		if(proot == null){
			return false; 
		}
		
		/* check if the two trees are identical */
		if(areSame(proot,sroot))
			return true;
		
		/* if the two trees are not identical , check for left and right subtree */
		return isSubtree(proot.getLeft(), sroot) || isSubtree(proot.getRight(), sroot);
		
		
	}
	
	/**
	 * function to get the height of the tree
	 * @param root root of the tree 
	 * @return height of the tree
	 */
	public int getBSTHeight(Node root){
		int leftheight=0, rightheight=0;
		
		/* check if the tree is empty */
		if(root == null){
			return 0;
		}
		else{
			 leftheight = getBSTHeight(root.getLeft());
			 rightheight = getBSTHeight(root.getRight());
			 
			 /* check which tree is tall */
			 if(leftheight > rightheight)
				 return leftheight + 1 ;
			 else
				 return rightheight + 1;
		}
		
	}
	
	/**
	 * function to print BST in level order ( BFS ) 
	 * @param root root of the tree
	 */
	public void printLevelOrder(Node root){
		int height = getBSTHeight(root);
		for(int i = 1 ; i<=height;i++)
			printTreeLevel(root, i);
	}
	
	/**
	 * function to print a particular level of the tree
	 * @param root root of the tree to be printed
	 * @param level level of the tree to be printed
	 */
	private void printTreeLevel(Node root, int level){
		
		/* base case */		
		if(root == null){
			return;
		}
		
		if(level == 1){
			System.out.print(root.getData() + " ");
		}
		
		if(level > 1){
			
			printTreeLevel(root.getLeft(), level-1);
			printTreeLevel(root.getRight(), level-1);
		}
	}
	
	/**
	 * function to print the bst in zig zag form
	 * @param root root of the tree
	 */
	public void printLevelOrderZigZag(Node root){
		boolean direction = false;
		int height = getBSTHeight(root);
		for(int i=1 ; i<=height; i++){
			/* call print level with direction */
			printTreeLevel(root, i, direction);
			
			/* reverse the direction for the next level */
			direction = !direction;
		}
	}
	
	/**
	 * function to print tree in zig zag order
	 * @param root root of the tree
	 * @param level level of the tree to be printed
	 * @param direction direction (left/right) in which the tree is to be printed
	 */
	private void printTreeLevel(Node root, int level, boolean direction){
		/* check base case */
		if(root == null){
			return;
		}
		
		if(level==1){
			System.out.print(root.getData() + " ");
		}
		
		if( level > 1 )
		{
			if(direction){
				printTreeLevel(root.getLeft(),level-1,direction);
				printTreeLevel(root.getRight(), level-1, direction);
			}
			else{
				printTreeLevel(root.getRight(), level-1, direction);
				printTreeLevel(root.getLeft(), level-1, direction);
			}
		}
	}
	
	/**
	 * function to find the smallest element in the BST
	 * @param root root of the tree
	 * @return int - smallest value node, -1 if empty tree
	 */
	public int getSmallestNode(Node root){		
		/* base case */
		if(root == null)
			return -1;
		while(root.getLeft()!=null){
			root = root.getLeft();
		}
		return root.getData();
	}
	
	public int getLargestNode(Node root){
		/* base case */
		if(root == null)
			return -1;
		
		while(root.getRight() != null)
			root = root.getRight();
		
		return root.getData();
	}
	
	
}
