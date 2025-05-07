import java.util.Scanner;
public class program5 
{

	public static void main(String[] args) 
	{
		System.out.println("enter a year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		//
		if ((year%4==0)&& (year%100!=0)||(year%400==0))
				{
			System.out.println(year +" is a leap year: true");
				}
		else
		{
			System.out.println(year+"is a leap year: false");
		}
		// TODO Auto-generated method stub

	}

}
