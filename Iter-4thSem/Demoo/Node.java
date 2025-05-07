package Demoo;

public class Node{
	int value;
	Node left;
	Node right;
	public Node(int key) {
		this.value=key;
	}

public static void main(String[] args) {
	Node root=new Node(1);
	root.left=new Node(2);
	root.right=new Node(3);
	root.left.left=new Node(4);
	root.left.right=new Node(5);
	
            preorder(root);
            System.out.println();
            inorder(root);
            System.out.println();
	postorder(root);
	
//	int[] array = {40, 20, 30, 60, 70, 10, 50};
//   // BinarySearchTree bst = new BinarySearchTree();
//    for (int i : array) {
//        bst.root = bst.insert(bst.root, i);
//    }
//
//    System.out.println("Inorder traversal of the BST:");
//    bst.inorderTraversal(bst.root);
//
//    System.out.println("\nMinimum value in the BST: " + bst.findMin(bst.root));
//    System.out.println("Maximum value in the BST: " + bst.findMax(bst.root));
//}
//
}

public static void preorder(Node n) {
	if(n==null) {
		return;
	}
	System.out.print(n.value+" ");
	preorder(n.left);
	preorder(n.right);
}


private static void postorder(Node n) {
	if(n==null) {
		return;
	}
	postorder(n.left);
	postorder(n.right);
	System.out.print(n.value+" ");
	
}
private static void inorder(Node n) {
	if(n==null) {
		return;
	}
	inorder(n.left);
	System.out.print(n.value+" ");
	inorder(n.right);
	
}
int findMin(Node root) {
    if (root == null)
        return Integer.MIN_VALUE;
    else if (root.left == null)
        return root.value;
    return findMin(root.left);
}

int findMax(Node root) {
    if (root == null)
        return Integer.MAX_VALUE;
    else if (root.right == null)
        return root.value;
    return findMax(root.right);
}


}