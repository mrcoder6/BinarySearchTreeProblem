// Java program to demonstrate
// insert operation in binary
// search tree


/* Output-
20
30
40
50
60
70
80
*/


class BinarySearchTree {


	class Node
	{
		int key;
		Node left, right;

		public Node(int item)
		{
			//code here....
		}
	}

	
	Node root;

	
	BinarySearchTree()
	{
		root = null;
	}


	void insert(int key)
	{
		root = insertRec(root, key);
	}


	Node insertRec(Node root, int key)
	{

		// code here....
		
	}

	
	void inorder()
	{
		inorderRec(root);
	}


	void inorderRec(Node root)
	{
		// code here....
	}


	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		
		tree.inorder();
	}
}

