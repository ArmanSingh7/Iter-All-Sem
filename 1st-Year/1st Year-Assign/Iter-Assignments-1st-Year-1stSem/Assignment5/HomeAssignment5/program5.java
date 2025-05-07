import java.util.Scanner;
public class program5
{
public static void main (String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter upto which term ");
	int n=sc.nextInt(),t1=0,t2=1; ;
	System.out.println("Fibonacci series");
	

for (int i = 1; i <= n; ++i)//5
{            
System.out.print(t1 + " ");
int sum = t1 + t2;  // 1   2        
t1 = t2;            // 1   1
t2 = sum; // 1  2 
} 
}
}