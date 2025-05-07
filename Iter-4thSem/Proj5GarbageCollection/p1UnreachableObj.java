package Proj5GarbageCollection;

public class p1UnreachableObj {
	private String name;
	public p1UnreachableObj(String name) {
		this.name=name;
	}
	public static void show() {
		p1UnreachableObj obj1 = new p1UnreachableObj("Show object");
		obj1.display();
		System.out.println("Show invoked");
	}
	public static void display() {
		new p1UnreachableObj("Display object invoked");
		System.out.println("Display invoked");
		
	}
	public static void main(String []args) {
		show();
		
		//calling gc
		System.gc();
		
	}
	//overriding 
	protected void finalize() throws Throwable{
		System.out.println(this.name);
	}

}
//o/p: Display invoked
//Show invoked
//Display object invoked
//Show object

