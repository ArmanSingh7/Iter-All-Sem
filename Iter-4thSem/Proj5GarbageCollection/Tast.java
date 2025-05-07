package Proj5GarbageCollection;



public class Tast {
	
		String objname;
		public Tast(String objname) {
			this.objname=objname;
		}
		static void show(){
			Tast t = new Tast("t1");
			display();
			}
		static void display() {
			Tast t2 = new Tast("t2");
		}
	
	public static void main(String []args) {
		show();
		System.gc();
		
	}
	protected void finalize() throws Throwable{
		System.out.println(this.objname);
	}

}
