package Proj5GarbageCollection;

public class p2ReassignRef {
 private String name;
 public p2ReassignRef(String name) {
	 this.name=name;
 }
 public static void main(String []args) {
	 p2ReassignRef obj1 = new p2ReassignRef("Obj1");
	 p2ReassignRef obj2 = new p2ReassignRef("Obj2");
	 
	 //reassigning reference
	 obj1=obj2;
	 System.gc();
	 
 }
 protected void finalize()throws Throwable{
	 System.out.println(this.name);
 }
}
// o/p: - obj1;