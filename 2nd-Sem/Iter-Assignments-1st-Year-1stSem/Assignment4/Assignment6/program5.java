import java.util.Scanner;
public class program5 
{
	static double area(int n,double side)
	{
		double a = (n*side*side)/(4*Math.tan(Math.PI/n));
		return a;
	}
	

	public static void main(String[] args) 
	{
		System.out.println("enter the number of side and length of side ");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		double s = sc.nextDouble();
		double ar = area(n,s);
		System.out.println("the area is= "+ar);
		// TODO Auto-generated method stub

	}

}
