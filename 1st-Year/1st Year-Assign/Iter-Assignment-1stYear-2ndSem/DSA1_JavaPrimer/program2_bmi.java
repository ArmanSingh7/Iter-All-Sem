import java.util.Scanner;
public class program2_bmi {

	public static void main(String[] args) 
	{
		System.out.println("enter weight in kg");
		Scanner sc = new Scanner(System.in);
		float w = sc.nextFloat();
		System.out.println("enter height in m");
		float h=sc.nextFloat();
		float bmi=0;
		bmi=w/(h*h);
		if (bmi<18.5)
			System.out.println("Underweight");
		else if (bmi>=18.5 && bmi<24.9)
			System.out.println("Normal weight");
		// TODO Auto-generated method stub

	}

}
