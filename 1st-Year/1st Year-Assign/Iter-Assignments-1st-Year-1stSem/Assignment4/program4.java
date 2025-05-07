import java.util.Scanner;
public class program4 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter first no.");
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt(); // 56
		System.out.println("Enter second no.");
		
		int y=sc.nextInt(); // 98
		//int gcd = 0;
		
		int a = (x>y)?x:y;//largest 98
		int b = (x<y)?x:y;//smallest  56
//		for(int i = 1; i <= x && i <= y; i++)  
//		{
//			
//		    if((x%i==0) && (y%i==0))  
//		    gcd = i;  
//		}  System.out.println("GCD is: "+ gcd);
		int rem=0;
		while(b>0) //56
		{
		rem=a%b; // 42
		a=b; // 56
		b=rem; // 
		}
		System.out.println("GCD = "+ a );
		
		 
		//System.out.println("GCD is: "+ gcd);
		// TODO Auto-generated method stub

	}

}
