package Demoo;
class Node11{
	int data;
	Node11 left;
	Node11 right;
	public Node11(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class BinaryTree {
    Node11 root;

    BinaryTree() {
        root = null;
    }

    // Function to insert a new node with given data in BST
    public void insert(int data) {
        root = insertRec(root, data);
    }

    /* A recursive function to insert a new node with given data in BST */
    private Node11 insertRec(Node11 root, int data) {
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node11(data);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        /* return the (unchanged) node pointer */
        return root;
    }

    // Function to perform inorder traversal
    public void inorder() {
        inorderRec(root);
    }

    // A recursive function to perform inorder traversal
    private void inorderRec(Node11 root) {
        if (root!= null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Function to perform preorder traversal
    public void preorder() {
        preorderRec(root);
    }

    // A recursive function to perform preorder traversal
    private void preorderRec(Node11 root) {
        if (root!= null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Function to perform postorder traversal
    public void postorder() {
        postorderRec(root);
    }

    // A recursive function to perform postorder traversal
    private void postorderRec(Node11 root) {
        if (root!= null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(15);
        tree.insert(10);
        tree.insert(20);
        tree.insert(25);
        tree.insert(8);
        tree.insert(12);

        // print inorder traversal of the tree
        System.out.println("Inorder traversal of binary tree is:");
        tree.inorder();

        // print preorder traversal of the tree
        System.out.println("\nPreorder traversal of binary tree is:");
        tree.preorder();

        // print postorder traversal of the tree
        System.out.println("\nPostorder traversal of binary tree is:");
        tree.postorder();
    }
}