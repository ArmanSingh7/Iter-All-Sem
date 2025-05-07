import java.util.Scanner;
public class program10 {

	public static void main(String[] args) 
	{
		System.out.println("enter the no. ");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int i=1,m=0;
		while (true)
		{
			m=(int)(Math.pow(3, i));
			i++;
			
			System.out.println(m);
			if (m>num)
			{
				
				break;
			}
			
			
		}
		m=m/3;
		System.out.println("The largest power of 3 less than or equal to "+num+" is "+m);
		
		
	}

}
