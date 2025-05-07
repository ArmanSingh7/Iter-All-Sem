import java.util.Scanner;
public class program1_2 {

	public static void main(String[] args) 
	{
		System.out.println("enter a no. greater than 2");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		while(n>2)
		{
			n=n/2;
			count+=1;
			
			
		}
		System.out.println("the number of times one must repeatedly divide this no. by 2 before getting a value less than 2 is "+count);
		// TODO Auto-generated method stub

	}

}
