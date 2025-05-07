import java.util.Scanner;
public class program6 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the time in seconds : ");
		Scanner inp = new Scanner(System.in);
		float sec = inp.nextFloat();
		double g = 32.174;
		double dis = (1.0/2)*g*sec*sec;
		System.out.println("Distance travelled : "+ dis);
		
		

	}

}
