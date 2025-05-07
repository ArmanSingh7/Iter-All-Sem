import java.util.Scanner;

class Node
{
 protected int regd_no;
 protected float mark;
 protected Node next;
}

public class LinkedList 
{
	static Scanner sc=new Scanner(System.in);
	static Node head=null;
	public static void create(Node start)
	{
		Node newnode=new Node();
		System.out.println("Enter Student Regd No:");
		newnode.regd_no=sc.nextInt();
		System.out.println("Enter Student Mark:");
		newnode.mark=sc.nextFloat();
		newnode.next=null;
		head=newnode;
		System.out.println("If you want to one more node 0: no 1:yes");
		int ch=sc.nextInt();
		while(ch==1)
		{
			Node n=new Node();
			System.out.println("Enter Student Regd No:");
			n.regd_no=sc.nextInt();
			System.out.println("Enter Student Mark:");
			n.mark=sc.nextFloat();
			n.next=null;
			newnode.next=n;
			newnode=n;
			System.out.println("If you want to add one more node 0: no 1:yes");
			ch=sc.nextInt();
		}
		
	}
	public static void display(Node start)
	{
		if(start==null)
			System.out.println(start);
		else {
		Node temp=start;
		while(temp!=null)
		{
			System.out.print("( Registration No:"+temp.regd_no+" ,");
			System.out.print("Mark:"+temp.mark+" ) ");
			if(temp.next!=null)
			{
				System.out.print(" --> ");
			}
			temp=temp.next;
		}
		System.out.println();
		}
	}
	public static Node InsBeg(Node start)
	{
		System.out.println("insert node info at first :");
		Node newnode=new Node();
		System.out.println("Enter Student Regd No:");
		newnode.regd_no=sc.nextInt();
		System.out.println("Enter Student Mark:");
		newnode.mark=sc.nextFloat();
		newnode.next=start;
		start=newnode;
		return start;
	}
	public static Node InsEnd(Node start)
	{
		System.out.println("insert node info at last :");
		Scanner sc=new Scanner(System.in);
		Node newnode=new Node();
		System.out.println("Enter Student Regd No:");
		newnode.regd_no=sc.nextInt();
		System.out.println("Enter Student Mark:");
		newnode.mark=sc.nextFloat();
		Node temp=start;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newnode;
		newnode.next=null;
		return start;
	}
	public static Node InsAny(Node start) {
		 System.out.println("enter position after which you want to insert");
		 Scanner sc=new Scanner(System.in);
		 int pos=sc.nextInt();
		 if(pos==1)
		 {
			start=InsBeg(start);
			return start;
		 }
		 Node newnode=new Node();
		 System.out.println("Enter Student Regd No:");
		 newnode.regd_no=sc.nextInt();
		 System.out.println("Enter Student Mark:");
		 newnode.mark=sc.nextFloat();
		 Node temp=start;
		 while(pos-1!=1 && temp!=null)
		 {
			 temp=temp.next;
			 pos--;
		 }
		 newnode.next=temp.next;
		 temp.next=newnode;
		 return start;
	}
	public static Node DelBeg(Node start) {
		System.out.println("delete node info at first :");
		if(start==null)
		{
			System.out.println("list is empty");
			return start;
		}	
		start=start.next;
		return start;
	}
	public static Node DelEnd(Node start) {
		System.out.println("delete node info at last :");
		if(start==null)
		{
			System.out.println("list is empty");
			return start;
		}	
		if(start.next==null) 
		{
			start=null;
			return start;
		}
		Node temp=start;
		while(temp.next.next!=null) 
		{
			temp=temp.next;
		}
		temp.next=null;
		return start;
	}
	public static Node DelAny(Node start) {
		System.out.println("enter position which you want to delete");
		 Scanner sc=new Scanner(System.in);
		 int pos=sc.nextInt();
		 if(pos==1) {
			 DelBeg(start);
		 }
		 Node curr=start;
		 while(pos-2>0 && curr!=null) {
			curr=curr.next;
			pos-=1;
		 }
		 Node temp=curr.next.next;
		 curr.next=temp;
		 return start;
	}
	public static Node reverse(Node start)
	{
		Node prevnode=null;
		Node currnode=start;
		Node nextnode=null;
		while(currnode!=null) {
			nextnode=currnode.next;
			currnode.next=prevnode;
			prevnode=currnode;
			currnode=nextnode;
		}
		return prevnode;
			
	}
	public static void search(Node start) {
		 System.out.println("enter the student regd.no that you want to search");
		 int n=sc.nextInt();
		 boolean result=false;
		 Node temp=head;
		 int c=0;
		 while(temp!=null) {
			 c++;
			 if(temp.regd_no==n) {
				 result=true;
				 System.out.println("Update "+c+" node student mark");
				 temp.mark=sc.nextFloat();
				 break;
			 }
				temp=temp.next;
			}
		 if(result==false) {
			 System.out.println("Student regd.no not present in linked list");
		 }
	}
	public static void sort(Node start) {
		Node temp=head;
		Node temp1;
		while(temp.next!=null) {
			temp1=temp.next;
			while(temp1!=null) {
				if(temp.mark<temp1.mark) {
					int r=temp.regd_no;
				    float a=temp.mark;
				    temp.regd_no=temp1.regd_no;
				    temp.mark=temp1.mark;
				    temp1.regd_no=r;
				    temp1.mark=a;
				}
				temp1=temp1.next;
			}
			temp=temp.next;
		}
	}
	public static int count(Node start) {
		Node temp=start;
		int c=0;
		while(temp!=null) {
			c++;
			temp=temp.next;
		}
		return c;
	}
	public static void main(String[] args)
	{
		while(true)
		{
		System.out.println("*MENU**");
		System.out.println("0:Exit");
		System.out.println("1:Creation");
		System.out.println("2:Display");
		System.out.println("3:Insbeg");
		System.out.println("4:Insend");
		System.out.println("5:Insany");
		System.out.println("6:Delbeg");
		System.out.println("7:Delend");
		System.out.println("8:Delany");
		System.out.println("9:Reverse");
		System.out.println("10:Search");
		System.out.println("11:Sort");
		System.out.println("12:Count");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 0:System.exit(0);
		case 1:create(head);
			   break;
		case 2:display(head);
			   break;
		case 3:head=InsBeg(head);
		       break;
		case 4:head=InsEnd(head);
		       break;
		case 5:head=InsAny(head);
		       break;
		case 6:head=DelBeg(head);
	           break;
	    case 7:head=DelEnd(head);
	           break;
	    case 8:head=DelAny(head);
	           break;
		case 9:head=reverse(head);
			   break;
		case 10:search(head);
		       break;
		case 11:sort(head);
		        System.out.println("Sort the nodes of the linked list according to the mark secured by the student from\n"
				+ "higher to lower.");
	           break;
		case 12:int c=count(head);
		        System.out.println("Number of nodes in the list: "+c);
		        break;
		default:System.out.println("Wrong choice");
		}
		}
	}

}