package Proj5GarbageCollection;

public class p3NullifiedRef {
	private String name;
	public p3NullifiedRef(String name) {
		this.name=name;
	}
	public static void main(String []args) {
	p3NullifiedRef p1 = new p3NullifiedRef("p11");
	//nullified
	p1=null;
	System.gc();
	}
	protected void finalize()throws Throwable{
		System.out.println(this.name);
	}

}
