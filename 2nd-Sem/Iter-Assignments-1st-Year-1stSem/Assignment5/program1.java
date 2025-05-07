 import java.util.Scanner;
public class program1 {

	public static void main(String[] args) 
	{
		System.out.println("enter a no.: ");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("enter 2nd no. ");
		int b = sc.nextInt();
		int fs = 0,ds=0;
		for (int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				fs=fs+i;
				//System.out.print(" ");
				
			}
			if (b%i==0)
			{
				ds=ds+i;
				
			}
			
			
		}
		if (a==ds && b==fs)
		{
			System.out.println("amicable no.s");
		}
		else
		{
			System.out.println("not amicable no.s");
		}
		// TODO Auto-generated method stub

	}

}
