package Demoo;

class Node1{
	int data;
	Node1 left,right;
	public Node1(int v) {
		data=v;
		left=null;right=null;
	}
}
public class verifybst {
	
	public static boolean isbst(Node1 curr,int min,int max ) {
		if(curr==null) {
			return true;
		}
		if(curr.data<min || curr.data>max)
			return false;
		return (isbst(curr.left,min,curr.data))&&(isbst(curr.right,curr.data,max));
	}
public static void main(String []args) {
	
}
}
