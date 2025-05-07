import java.util.Scanner;
public class program2 {

	public static void main(String[] args) 
	{
		System.out.println("enter a no.: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int rem = n,rev=0,c=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse prime= "+rev);
		for(int i=1;i<=rev;i++)
		{
			if(rev%i==0)
			{
				c=c+1;
			}
			
		
		}
		if (c>2)
		{
			System.out.println("not twisted prime");
			
		}
		else
		{
			System.out.println("twisted prime");
		}
		
		

	}

}
