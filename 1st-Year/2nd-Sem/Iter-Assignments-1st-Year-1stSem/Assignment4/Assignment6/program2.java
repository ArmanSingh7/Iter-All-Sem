import java.util.Scanner;
public class program2 {
	
	static int getPentagonalNumber(int n)
	{
		return n*(3*n-1)/2;
	}

	public static void main(String[] args) 
	{
		int n = 100;
		for (int i=1;i<=n;i++)
		{
			System.out.print(getPentagonalNumber(i)+" ");
			if(i%10==0)
				System.out.println();
		}

		// TODO Auto-generated method stub

	}

}

