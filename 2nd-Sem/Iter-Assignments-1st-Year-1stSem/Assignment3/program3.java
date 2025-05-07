import java.util.Scanner;
public class program3 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter 3 integers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if ((a<b)&&(b<c))
		{
			System.out.println("Increasing order");
		}
		else if ((a>b)&&(b>c))
		{
			System.out.println("Decreasing order");
		}
		else
		{
			System.out.println("Neither increasing nor decreasing");
		}
		// TODO Auto-generated method stub

	}

}
