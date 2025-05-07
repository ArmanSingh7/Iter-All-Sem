package Proj4_Error_handling;
import java.util.*;
public class p25InputMismatch {
	public static void Method()throws InputMismatchException
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any Number:");
		int num=obj.nextInt();
	    System.out.println("You ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Method();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}

	}

}