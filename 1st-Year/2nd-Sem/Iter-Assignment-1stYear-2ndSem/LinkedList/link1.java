//import java.util.*;
//class Node
//{
//	protected int regd_no;
//	protected float mark;
//	protected Node next;
//}
//public class link1 {
//    public static Node create(Node start)
//    {
//    	Node last = null;
//    	Scanner sc = new Scanner(System.in);
//    	char ch;
//    	do
//    	{
//    		System.out.println("Enter the registration number of new node: ");
//    		int regd_no = sc.nextInt();
//    		System.out.println("Enter the roll number of node: ");
//    		float mark = sc.nextFloat();
//    		Node node = new Node();
//    		node.regd_no = regd_no;
//    		node.mark = mark;
//    		node.next = null;
//    		if(start == null)
//    		{
//    			start = node;
//    			last = node;
//    		}
//    		else
//    		{
//    			last.next = node;
//    			last = node;
//    		}
//    		System.out.println("Do you want to create another node: ");
//        	ch = sc.next().charAt(0);
//    	}while(ch=='Y'||ch=='y');
//    	return start;
//    }
//    public static void display(Node start)
//    {
//    	Node p = start;
//    	System.out.println("Regis. no \t Marks");
//    	while(p!=null)
//    	{
//    		System.out.println(p.regd_no+" \t\t "+p.mark);
//    		p = p.next;
//    	}
//    }
//    public static Node InsBeg(Node start)
//    {
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("Enter the registration number of new node: ");
//		int regd_no = sc.nextInt();
//		System.out.println("Enter the roll number of node: ");
//		float mark = sc.nextFloat();
//		Node node = new Node();
//		node.regd_no = regd_no;
//		node.mark = mark;
//		node.next = start;
//		start = node;
//    	return start;
//    }
//    public static Node InsEnd(Node start)
//    {
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("Enter the registration number of new node: ");
//		int regd_no = sc.nextInt();
//		System.out.println("Enter the roll number of node: ");
//		float mark = sc.nextFloat();
//		Node node = new Node();
//		node.regd_no = regd_no;
//		node.mark = mark;
//		node.next = null;
//		Node q = start;
//		while(q.next!=null)
//		{
//			q = q.next;
//		}
//		q.next = node;
//    	return start;
//    }
//    public static Node InsAny(Node start)
//    {
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("Enter the registration number of new node: ");
//		int regd_no = sc.nextInt();
//		System.out.println("Enter the roll number of node: ");
//		float mark = sc.nextFloat();
//		Node node = new Node();
//		node.regd_no = regd_no;
//		node.mark = mark;
//		System.out.println("Enter position of new node: ");
//        int pos = sc.nextInt();	
//        if(start == null)
//        {
//        	start = node;
//        	node.next = null;
//        	System.out.println("Node add first position: ");
//        }
//        else if(pos>count(start))
//        {
//        	Node q = start;
//        	while(q.next!=null)
//    		{
//    			q = q.next;
//    		}
//        	q.next = node;
//        	node.next = null;
//        	System.out.println("position not found, so ne Node add last position: ");
//        }
//        else
//        {
//        	Node q = start;
//        	for(int i=1;i<pos-1;i++)
//        	{
//        		q = q.next;
//        	}
//        	node.next = q.next;
//        	q.next = node;
//        	System.out.println("New node add "+pos+" position");
//        }
//    	return start;
//    }
//    public static Node DelBeg(Node start)
//    {
//    	if(start==null)
//    	{
//    		System.out.println("Empty linked list, delete not possible");
//    	}
//    	else
//    	{
//    		Node q = start;
//    		start = start.next;
//    		System.out.println("Deleted node info-- registration no: "+q.regd_no+" and mark: "+q.mark);
//    	}
//    	return start;
//    }
//    public static Node DelEnd(Node start)
//    {
//    	if(start==null)
//    	{
//    		System.out.println("Empty linked list, delete not possible");
//    	}
//    	else
//    	{
//    		Node q = start;
//    		Node r = start;
//    		while(q.next!=null)
//    		{
//    			r = q;
//    			q = q.next;
//    		}
//    		r.next = null;
//    		System.out.println("Deleted node info-- registration no: "+q.regd_no+" and mark: "+q.mark);
//    	}
//    	return start;
//    }
//    public static Node DelAny(Node start)
//    {
//    	Scanner sc = new Scanner(System.in);
//		System.out.println("Enter position of deleted node: ");
//        int pos = sc.nextInt();	
//        if(start == null)
//        {
//        	System.out.println("Empty linkedlist, delete not posible");
//        }
//        else if(pos>count(start))
//        {
//        	System.out.println("position not found, delete not posible ");
//        }
//        else
//        {
//        	Node q = start;
//        	Node r = start;
//        	for(int i=1;i<pos;i++)
//        	{
//        		r = q;
//        		q = q.next;
//        	}
//        	r.next = q.next;
//        	System.out.println("Deleted node info-- registration no: "+q.regd_no+" and mark: "+q.mark);
//        }
//    	return start;
//    }
//    public static Node DelNode_regNumber(Node start)
//    {
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("Enter the student registration no: ");
//    	int regno = sc.nextInt();
//    	Node q = start;
//    	int f = 0;
//    	if(q.regd_no == regno && q == start)
//    	{
//    		start = start.next;
//    		f = 1;
//    		System.out.println("Deleted node info-- registration no: "+q.regd_no+" and mark: "+q.mark);
//    	}
//    	else
//    	{
//    		Node p = q;
//    		q = q.next;
//    		while(q!=null)
//    		{
//    			if(q.regd_no == regno)
//    			{
//    				p.next = q.next;
//    				System.out.println("Deleted node info-- registration no: "+q.regd_no+" and mark: "+q.mark);
//    				f = 1;
//    				break;
//    			}
//    			p = q;
//    			q = q.next;
//    		}
//    	}
//    	if(f==0)
//    	{
//    		System.out.println("Error: registration number not found");
//    	}
//    	return start;
//    }
//    public static int count(Node start)
//    {
//    	int c = 0;
//    	Node q = start;
//    	while(q!=null)
//    	{
//    		c++;
//    		q=q.next;
//    	}
//    	return c;
//    }
//    public static void search(Node start)
//    {
//    	int f = 0;
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("Enter the student registration no: ");
//    	int regno = sc.nextInt();
//    	Node q = start;
//    	while(q!=null)
//    	{
//    		if(q.regd_no == regno)
//    		{
//    			System.out.println("Registration number found, enter the updated marks: ");
//    			float m = sc.nextFloat();
//    			q.mark = m;
//    			System.out.println(m+" marks updated at registration no. "+regno);
//    			f = 0;
//    			break;
//    		}
//    		q=q.next;
//    	}
//    	if(f==0)
//    	{
//    		System.out.println("Error: registration number not found");
//    	}
//    }
//    public static Node reverse(Node start)
//    {
//    	Node q = start.next;
//    	Node p = start.next;
//    	start.next = null;
//    	while(q!=null)
//    	{
//    		p = q;
//    		q = q.next;
//    		p.next = start;
//    		start = p;
//    	}
//    	System.out.println("Linkedlist reversed");
//    	return start;
//    }
//    public static Node sort(Node start)
//    {
//    	Node m = start;
//    	while(m.next!=null)
//    	{
//    		Node q = start;
//    		Node p = q.next;
//    		while(p!=null)
//    		{
//    			if(q.mark<p.mark)
//    			{
//    				int reg = q.regd_no;
//    				float mark= q.mark;
//    				q.regd_no = p.regd_no;
//    				q.mark = p.mark;
//    				p.regd_no = reg;
//    				p.mark = mark;
//    			}
//    			q = p;
//    			p = p.next;
//    		}
//    		m = m.next;
//    	}
//    	System.out.println("Linkedlist sorted based on marks");
//    	return start;
//    }
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Node start = null;
//		System.out.println("Program for creating single linkedlist");
//		while(true)
//		{
//			System.out.println("Manu for different operation");
//			System.out.println("Press 0: Exit");
//			System.out.println("Press 1: Creation Linkedlist");
//			System.out.println("Press 2: Display Linkedlist");
//			System.out.println("Press 3: Add node at begining");
//			System.out.println("Press 4: Add node at end");
//			System.out.println("Press 5: Add node at any position");
//			System.out.println("Press 6: Delete first node");
//			System.out.println("Press 7: Delete last node");
//			System.out.println("Press 8: Delete node from any position");
//			System.out.println("Press 9: Delete node based on registration no.");
//			System.out.println("Press 10: count of linkedlist");
//			System.out.println("Press 11: search a node from linkedlist");
//			System.out.println("Press 12: sort the linkedlist");
//			System.out.println("Press 13: reverse the linkedlist");
//			System.out.println("Enter your choice: ");
//			int choice = sc.nextInt();
//			switch(choice)
//			{
//			case 0: System.exit(0);
//			case 1: start = create(start);
//			        break;
//			case 2: display(start);
//			        break;
//			case 3: start = InsBeg(start);
//	        		break;
//			case 4: start = InsEnd(start);
//	        		break;
//			case 5: start = InsAny(start);
//			        break;
//			case 6: start = DelBeg(start);
//	        		break;
//			case 7: start = DelEnd(start);
//	        		break;
//			case 8: start = DelAny(start);
//					break;
//			case 9: start = DelNode_regNumber(start);
//					break;
//			case 10: int c = count(start);
//					System.out.println("Number of node in linked is: "+c);
//					break;
//			case 11: search(start);
//					break;
//			case 12: start = sort(start);
//					break;
//			case 13: start = reverse(start);
//					break;
//			default: System.out.println("Wrong choice, try again");
//			}
//		}
//	}
//}