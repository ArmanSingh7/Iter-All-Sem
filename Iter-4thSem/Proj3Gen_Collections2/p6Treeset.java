package Proj3Gen_Collections2;
import java.util.*;

public class p6Treeset {
public static void main(String[] args) {
	TreeSet<Integer> a = new TreeSet<>();
	a.add(7);
	a.add(9);
	a.add(56);
	System.out.println(a);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to be searched: ");
	int s = sc.nextInt();
	if(a.contains(s))
		System.out.println("Number is present: ");
	else
		System.out.println("Not present");
	
	System.out.println("Enter a number to remove: ");
	int r = sc.nextInt();
	if(a.remove(r)) {
		System.out.println(r+" has been removed from the tree set: ");
		System.out.println("Updated treeSet elements: "+a);
	}
	else
		System.out.println(r+" is not present in the tree set");
}
}
