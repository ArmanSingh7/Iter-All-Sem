import java.util.Scanner;

public class program4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no. betn 0 and 1000");
	    int no = sc.nextInt();
	    int ones = no % 10;
	    int tens = no /10;
	    int ten = tens%10;
	    int h = no /100;
	    int sum = ones + ten + h;
	    System.out.println(" sum is : " +  sum);
		// TODO Auto-generated method stub

	}

}
