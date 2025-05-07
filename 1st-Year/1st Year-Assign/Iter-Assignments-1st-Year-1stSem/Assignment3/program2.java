import java.util.Scanner;
public class program2 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter water drank in ml");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x >= 5000)
		{
			System.out.println("Yes , Alice is following doctor's advice");
		}
		else
		{
			System.out.println("No , Alice is not following doctor's advice");
			
		}
		// TODO Auto-generated method stub

	}

}
