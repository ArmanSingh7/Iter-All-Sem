package program10;
import java.util.Scanner;
class Student{
	String name;
	int roll;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter roll");
		roll = sc.nextInt();
		
	}
	public void output() {
		System.out.println("name-"+name);
		System.out.println("roll-"+roll);
		
	}
}
class Test extends Student{
	int mark1;
	int mark2;
	public void input() {
		super.input();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter mark 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter mark 2: ");
        mark2 = sc.nextInt();
		
	}
	public void output() {
		super.output();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
	}
	
}
