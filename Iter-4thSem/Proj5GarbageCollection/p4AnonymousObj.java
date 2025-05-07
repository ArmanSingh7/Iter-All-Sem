package Proj5GarbageCollection;

public class p4AnonymousObj {
	private String name;
	public p4AnonymousObj(String name) {
		this.name=name;
	}
	
  public static void main(String []args) {
	  new p4AnonymousObj("Anonymous obj gc");
	  System.gc();
	  
	  
  }
  protected void finalize() throws Throwable{
	  System.out.println(this.name);
  }
}
