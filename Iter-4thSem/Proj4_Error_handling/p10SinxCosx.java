package Proj4_Error_handling;
import java.util.*;
public class p10SinxCosx {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of x ");
	double x= sc.nextDouble();
	try {
		double result=(Math.sin(x)+Math.cos(x))/Math.tan(x);
		final double EPSILON = 1e-10; 
		if(Math.abs(x % (Math.PI / 2)) < EPSILON || Math.abs(x % (Math.PI / 2) - (Math.PI / 2)) < EPSILON)
		{
			throw new ArithmeticException("Division by zero error: x is close to a multiple of π/2");
		}
		System.out.print("Result = "+result);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}

}
}
