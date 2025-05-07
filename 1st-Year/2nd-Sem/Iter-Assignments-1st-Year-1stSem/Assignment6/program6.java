import java.util.Scanner;
public class program6 
{
	public static int count(String str,char a)
	{
		String s=str;//thjklkl
		char ch1 = a;//k
		int n = 0;
		for (int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch1)
				n++;
			
		}
		return (n);
	}

	public static void main(String[] args) 
	{
		System.out.print("enter a string - ");
		Scanner sc=new Scanner(System.in);
		String p=sc.next();
		System.out.print("enter the char for occurence- ");
		char ch = sc.next().charAt(0);
		int num = count(p,ch);
		System.out.println("no. of occurence is- "+num);
		// TODO Auto-generated method stub

	}

}
