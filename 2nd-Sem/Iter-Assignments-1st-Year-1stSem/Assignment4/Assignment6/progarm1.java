import java.util.Scanner;
public class progarm1 {

	public static int additionSimple(int x,int y) 
	{
		int sum = x+y;
		return sum;
		
		// TODO Auto-generated method stub

	}
	static int subtractionSimple(int a,int b)
	{
		int sub= b-a;
		return sub;
	}
	static int multiplicationSimple(int x,int y)
	{
		int mul= x*y;
		return mul;
	}
	static double divisionSimple(double x, double y)
	{
		double div = 0;
		if(x!=0)
		{
		    div= y/x;
			
		}
		else {
			System.out.println("division invalid as x= 0");
		}
		
		return div;
		
		 
	}
	static int remainderSimple(int m , int n)
	{
		int rem = m%n;
		return rem;
	}
	static double squareRootSimple(int n)
	{
		double sq=Math.pow(n,0.5);
		return sq;
	}
	public static void main(String[]args) {
		System.out.println("Enter 2no.s");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y = sc.nextInt();
		System.out.println("enter a no. for sqr root");
		int p=sc.nextInt();
		
		int a = additionSimple(x,y);
		int su= subtractionSimple(x,y);
		int mul= multiplicationSimple(x,y);
		double di= divisionSimple(x,y);
		int re= remainderSimple(x,y);
		double sq1 = squareRootSimple(p);
		System.out.println("addition= "+a);
		System.out.println("subtraction= "+su);
		System.out.println("multiplication= "+mul);
		System.out.println("Division= "+di);
		System.out.println("remainder= "+re);
		System.out.println("square= "+sq1);
	}

}
