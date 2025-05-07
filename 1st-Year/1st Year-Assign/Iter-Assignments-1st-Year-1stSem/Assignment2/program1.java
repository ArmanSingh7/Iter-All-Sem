
import java.util.Scanner;

public class program1 
{

	public static void main(String[] args) 
	{
		
	    Scanner input = new Scanner(System.in);
		
		System.out.println("enter temp in fahrenheit: ");
		double temp = input.nextDouble();
		
		double celsius = (temp - 32) * (5.0 /9);
		System.out.println( celsius);
		
		
		// TODO Auto-generated method stub

	}

}
