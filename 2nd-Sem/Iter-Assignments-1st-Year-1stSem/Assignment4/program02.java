import java.util.Scanner;
public class program02 {

	public static void main(String[] args) 
	{
		int n,r=0,sum=0;
		System.out.println("Enter a no. n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();//126
		int n1=n;//126
		while(n>0) //126  12
		{
		r=n%10;// 6 2 1
		sum=sum+r; //6 8 9
		n=n/10; //12 1 0
		}
		if(sum%9==0)
			System.out.println(n1+" is divisible by 9");
		else 
			System.out.println(n1+" is not divisible by 9");
		
		
		
		// TODO Auto-generated method stub

	}

}