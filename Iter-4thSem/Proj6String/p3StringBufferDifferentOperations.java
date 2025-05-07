package Proj6String;
import java.util.Scanner;
public class p3StringBufferDifferentOperations {
public static void main(String[]args) {
	StringBuffer existingtext = new StringBuffer("ARMAN");
	Scanner sc  = new Scanner(System.in);
	System.out.println("Menu");
	System.out.println("Enter the option to perform operations");
	System.out.println("1. append text to the existing text: ");
	System.out.println("2. insert a given string at a specified index");
	System.out.println("3.Delete a portion of text");
	System.out.println("4. Reverse");
	System.out.println("5. Replace a portion of text btn 2 specified text");
	System.out.println("6. exit");
	boolean b = false;
	int x = sc.nextInt();
	while(!b) {
		if(x==1) {
			System.out.println("Enter the string to append");
			String s = sc.next();
			existingtext.append(s);System.out.println(existingtext);
			System.out.println("capacity= "+ existingtext.capacity()+" length"+existingtext.length());
			
			System.out.println("enter next operation");
			x=sc.nextInt();
			}
		if(x==2) {
			System.out.println("Enter index then text to add at specified index");
			int p = sc.nextInt();
			String ss=sc.next();
			
			existingtext.insert(p, ss);System.out.println(existingtext);
			System.out.println("capacity= "+ existingtext.capacity()+" length"+existingtext.length());
			System.out.println("enter next operation");
			x=sc.nextInt();
		}
		if(x==3) {
			System.out.println("Delete portion of text btn 2 spec index");
			int start = sc.nextInt();
			int end = sc.nextInt();
			existingtext.delete(start, end);System.out.println(existingtext);
			System.out.println("capacity= "+ existingtext.capacity()+" length"+existingtext.length());
			System.out.println("enter next operation");
			x=sc.nextInt();
		}
		if(x==4) {
			System.out.println("reversing");
			existingtext.reverse();
			System.out.println(existingtext);
			System.out.println("capacity= "+ existingtext.capacity()+" length"+existingtext.length());
			System.out.println("enter next operation");
			x=sc.nextInt();
		}
		if(x==5) {
			System.out.println("Replace the portion with text btn 2specified indeces: ");
			
			int start=sc.nextInt();
			int end= sc.nextInt();
			String replace=sc.next();
			existingtext.replace(start, end, replace);
			System.out.println(existingtext);
			System.out.println("capacity= "+ existingtext.capacity()+" length"+existingtext.length());
			System.out.println("enter next operation");
			
		x=sc.nextInt();
			
		}
		if(x==6) {
			System.out.println("Exiting");
			b=true;
			break;
		}
	}
	
	//i. append a given string to existing text
}
}
