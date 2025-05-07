import java.util.Scanner;
public class program7 {

	public static void main(String[] args) 
	{
		System.out.println("Enter a no. for which you want to find the multiplication table: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int t= 0;
		for (int i=1;i<11;i++)
		{
			t=n*i;
			System.out.println(n+" x "+i+" = "+t);
		}
		
		// TODO Auto-generated method stub

	}

}
