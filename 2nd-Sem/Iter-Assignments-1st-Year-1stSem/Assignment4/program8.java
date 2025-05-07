import java.util.Scanner;
public class program8 {

	public static void main(String[] args) 
	{
		System.out.println("Play ");
		Scanner sc=new Scanner(System.in);
		int cg = (int)(Math.random()*10);
		System.out.println(cg);
		while(true)
		{
			System.out.println("enter your guess: ");
			int ug=sc.nextInt();
			if (ug>cg)
			{
				System.out.println("Too high,try again ");
			}
			else if(ug<cg)
			{
				System.out.println("Too low,try again ");
			}
			else
			{
				System.out.println("Good guess");
				break;
			}
		}
		// TODO Auto-generated method stub

	}

}
