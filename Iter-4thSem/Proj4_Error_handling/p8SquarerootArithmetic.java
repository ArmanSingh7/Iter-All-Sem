package Proj4_Error_handling;
import java.util.*;

public class p8SquarerootArithmetic {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	
	try {
		double x = sc.nextInt();
		double squareroot = (Math.sqrt(x));
		
		if(x==0 && x<=0)
			throw new ArithmeticException("Output cannot be Negative or 0");
		System.out.println(squareroot);
		
	}
	catch (ArithmeticException e) {
		System.out.println(e);
	}
 }
}
