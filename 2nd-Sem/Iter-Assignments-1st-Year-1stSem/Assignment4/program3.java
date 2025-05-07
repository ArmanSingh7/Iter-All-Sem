import java.util.Scanner;
public class program3 {

	public static void main(String[] args) 
	{
		System.out.println("Enter an integer N");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int i=0,r=0;
		int s=0;
		do
		{
			r=1+(int)(Math.random()*n);	
			System.out.println(r);
			s=s+r;
			i++;
		}
		while(i<n);
		{
			double avg=(double)s/n;
			System.out.println("average="+avg);
		}
		
	}

}
