import java.util.Scanner;
public class program10 {
	static double area(double a, double b) {
		double s= 0.5*a*b;
		return s;
	}
	static void areaS(int c) {
		System.out.println("the area of sqr="+(c*c));
		
	}
	static void areaCircle(double r) {
		System.out.println("the area circ="+(Math.PI*r*r));
	}
	static void areaRec(double a, double b) {
		System.out.println("area rect="+(a*b));
	}

	public static void main(String[] args) {
		System.out.println("enter base and height  ");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter ");
		int c=sc.nextInt();
		double ar= area(a,b);
		System.out.println(ar);
		// TODO Auto-generated method stub

	}

}
