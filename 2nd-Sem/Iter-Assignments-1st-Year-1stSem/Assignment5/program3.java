import java.util.Scanner;
public class program3 {

	public static void main(String[] args) 
	{
		System.out.println("enter first no. ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("enter second no. ");
		int b = sc.nextInt();
		int c=0 ;
		for (int i =a;i<=b;i++)
		{
			for (int j=1;j<=i;j++)
			{
				if (i%j==0)
					c++;
			}
			if (c==2) 
			{
				System.out.print(i+" ");
			}
				
			c=0;
		}
		}
		
		// TODO Auto-generated method stub

	}


