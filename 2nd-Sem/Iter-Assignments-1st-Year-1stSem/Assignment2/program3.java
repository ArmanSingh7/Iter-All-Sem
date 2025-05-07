import java.util.Scanner;
public class program3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter basic salary: ");
		float sal = sc.nextFloat();
		float da = sal * 40/100;
		float HRA = sal * 20/100;
		float gs = sal + da + HRA;
		System.out.println("DA is " + da);
		System.out.println("HRA is " + HRA);
		System.out.println("Gross salary is " + gs);


	}

}
