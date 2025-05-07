import java.util.Scanner;
public class program4 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter user number");
		Scanner sc = new Scanner(System.in);
		int no= sc.nextInt();
		int cg= (int)(Math.random()*9) +1;
		System.out.println("Computer guess: "+cg);
		if (no==cg)
		{
			System.out.println("You got it right");
		}
		else if (((no-cg)==1)||((no-cg)==-1))
		{
			System.out.println("Almost got it ");
		}
		else
		{
			System.out.println("You got it wrong");
		}
		// TODO Auto-generated method stub

	}

}
/* int max = 9 ;
 * int min = 1;
 * int r = (int)(min+max)*Math.random());
 *# 1 + 8.9999999
 **/
