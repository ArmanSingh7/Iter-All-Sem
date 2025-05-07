import java.util.Scanner;
public class program9 {

	public static void main(String[] args) 
	{
		System.out.println("Enter 3 no.s to compare");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a>b && a>c )
		{
			System.out.println("Largest no. is "+a);
			if (b>c)
			{
				System.out.println("2nd largest no. is "+b);
			}
			else 
			{
				System.out.println("2nd largest no. is "+c);
			}
		}
		else if(b>a && b>c)
		{
			System.out.println("Largest no. is "+b);
			if (a>c)
			{
				System.out.println("2nd largest no. is "+a);
			}
			else
			{
				System.out.println("2nd largest no. is "+c);
			}
			
		}
		else
		{
			System.out.println("Largest no. is "+c);
			if (b>a)
			{
				System.out.println("2nd largest no. is "+b);
				
			}
			else
			{
				System.out.println("2nd largest no. is "+a);
			}
				
		}
		// TODO Auto-generated method stub

	}

}
/*
 * if (a>b)&&(a>c)
 * 
 *   max=a;
 *   sec_max=(b>c)?b:c
 * else if (b>a)&&(b>c)
 *  max=b;
 *  sec_max= (a>c)?a:c
 * else
 *   max= a;max=b;
 *   secmax= */
