package proj9_0BinaryTree;
import java.util.*;
class Node{
	int val;
	Node left;
	Node right;
	public Node(int val) {
		this.val=val;
		this.left=null;
		this.right=null;
	}
}
//when the given array of data is in preorder data
class BinaryTreePreorderdata{
	static int idx=-1;
	public static Node buildtree(int[]nodes) {
		idx++;
		if(nodes[idx]==-1) {
			return null;
		}
		Node newnode = new Node(nodes[idx]);
		newnode.left=buildtree(nodes);
		newnode.right=buildtree(nodes);
		return newnode;
		
	}
	
	public void Preorder(Node node) {
		if(node!=null) {
			System.out.print(" "+node.val);
			Preorder(node.left);
			Preorder(node.right);
		}
	}
	
	public void inorder(Node node) {
        if (node ==null) {
        	return;
        }
            inorder(node.left);
            System.out.print(" " + node.val);
            inorder(node.right);
        
    }
	public void postorder(Node node) {
		if(node==null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(" "+node.val);
	}
	public void levelorder(Node root) {
		//use iteration and queue data structure to use fifo
		if(root==null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node curr= q.remove();
			if(curr==null) {
				System.out.println();//queue is empty
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			else {
				System.out.print(curr.val+" ");
				if(curr.left!=null)
					q.add(curr.left);
			
			if(curr.right!=null)
				q.add(curr.right);
			}
			
		}
		 
	}
	
}
public class BinaryTreeQ {
    public static void main(String []args) {
    	int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};//pre-order sequence
    	int nodes1[]= {1,2,3,-1,-1,5,-1,-1,4,-1,6,-1,-1};
    	BinaryTreePreorderdata a = new BinaryTreePreorderdata();
    	BinaryTreePreorderdata a1 = new BinaryTreePreorderdata();
    	Node root = a.buildtree(nodes);
    	System.out.println(root.val);
    	a.Preorder(root);
    	System.out.println();
    	a.inorder(root);
    	System.out.println();
    	a.postorder(root);
    	System.out.println();
    	a.levelorder(root);
    	
    
}
}