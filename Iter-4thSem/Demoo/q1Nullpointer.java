package Demoo;

public class q1Nullpointer {
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
