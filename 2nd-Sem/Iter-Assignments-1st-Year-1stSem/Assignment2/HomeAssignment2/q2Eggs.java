import java.util.Scanner;
public class q2Eggs 
{
	public static void main(String []args)
	{
		System.out.println("enter no. of eggs");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int gross = n/144;
		n=n%144;
		int dozen = n/12;
		n=n%12;
		int remegg= n;
		System.out.println(gross + " "+ dozen + " "+ remegg);
	}

}
