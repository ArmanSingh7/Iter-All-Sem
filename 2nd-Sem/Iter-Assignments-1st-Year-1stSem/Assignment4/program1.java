import java.util.Scanner;
public class program1 {

	public static void main(String[] args) 
	{
		int cf,ct,cb,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First no.");
		cf=sc.nextInt();
		System.out.println("Enter the second no.");
		ct=sc.nextInt();
		System.out.println("Enter the third no.");
		cb=sc.nextInt();
		for(int i=cf;i<=ct;i+=cb)// 4 13 3
		{
		System.out.print(i+" ");// 4 7 10 13
		sum = sum+i;//7 17 
		
		
		}
		
		System.out.println(" \n The sum of number displayed is= "+sum);
		// TODO Auto-generated method stub

	}

}
