package Proj4_Error_handling;
public class p1Nullpointer {
public static void main(String[] args) {
	String s=null;
	try {
		int x = s.length();
	}
	catch(Exception e) {
		System.out.println(e+" error"+ e.getMessage());
	}
}
}
