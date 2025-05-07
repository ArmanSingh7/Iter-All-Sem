import java.util.Scanner;
public class program6 {

	public static void main(String[] args) 
	{
		System.out.println("enter base ");
		Scanner sc= new Scanner(System.in);
		int base=sc.nextInt();
		System.out.println("enter power ");
		int power=sc.nextInt();
		int s=1,i=1;
		while(i<=power)
		{
			s=s*base;
			i++;
		}
		System.out.println(base+" to the power "+power+" is "+ s);
		
		// TODO Auto-generated method stub

	}

}
