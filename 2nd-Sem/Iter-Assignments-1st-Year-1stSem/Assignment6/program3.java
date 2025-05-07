import java.util.Scanner;
public class program3 {
	static int reverse(int n)//575
	{
		int dig=0, rev=0;
		while (n>0)
		{
			dig=n%10;
			rev = rev*10+dig;
			n=n/10;
			
		}
		return rev;//575
	}
	static boolean isPalindrome(int n)
	{

		int x= reverse(n);//575
		boolean a = (n==x);//true
		return a;
	}

	public static void main(String[] args) 
	{
		System.out.println("enter a no. ");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int q= reverse(w);
		boolean a= isPalindrome(w);
		System.out.println("reverse is= "+q);
		System.out.println("palindrome= "+a);
		// TODO Auto-generated method stub

	}

}
