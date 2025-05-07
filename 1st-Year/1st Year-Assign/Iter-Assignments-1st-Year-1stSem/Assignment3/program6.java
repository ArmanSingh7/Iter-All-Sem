import java.util.Scanner;
public class program6 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter units to calc bill: ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = 0;
		if (x<=50)
		{
			y = 3*x;
			System.out.println("Monthly bill = "+y);
		}
		else if ((x>50)&&(x<=200))
		{
			y= (50*3)+((x-50)*4.80);
			System.out.println("Monthly bill = " +y);
		}
		else if ((x>200)&&(x<=400))
		{
			y=(50*3)+(4.80*150)+((x-200)*5.80);
			System.out.println("Monthly bill = "+y);
		}
		else
		{
			y= (50*3)+(4.80*150)+(5.80*(200)+(6.20*(x-400)));
			System.out.println("Monthly bill = "+y);
		}
		// TODO Auto-generated method stub

	}

}
