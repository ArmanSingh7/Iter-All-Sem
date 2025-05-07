import java.util.Scanner;
public class program3_spy {

	public static void main(String[] args) 
	{
		System.out.println("enter a no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0,prod=1;
		int d=0,d1=0;
		int num;
		num=n;
		while(n>0)
		{
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		while (num>0)
		{
			d1=num%10;
			prod = prod*d1;
			num=num/10;
		}
		System.out.println(sum);
		System.out.println(prod);
		if(sum==prod)
			System.out.println("spy");
		else
			System.out.println("not spy");
		
		// TODO Auto-generated method stub

	}

}
