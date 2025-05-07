import java.util.Scanner;
public class program5 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the radius of the hemisphere: ");
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		double sa = 3 *((float)Math.PI) * r * r;
		double vol = (2/3.0)*((float)Math.PI)*((int)Math.pow(r, 3));
		System.out.println("The surface area of hemisphere is: "+sa);
		System.out.println("The volume of hemisphere is: "+vol);
		

	}

}
