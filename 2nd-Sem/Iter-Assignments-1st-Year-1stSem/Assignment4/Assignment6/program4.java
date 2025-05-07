
public class program4 
{
	static int numberofDaysInYear(int x)
	{
		if (x%4==0 || x%100!=0 && x%400==0)
		{
			return 366;
		}
		else {
			return 365;
		}
	}

	public static void main(String[] args) 
	{
		for (int i =2000;i<=2020;i++)
		{
			int n= numberofDaysInYear(i);
			System.out.println("the total no.of days in year "+i+" = "+n);
		}
		// TODO Auto-generated method stub

	}

}
