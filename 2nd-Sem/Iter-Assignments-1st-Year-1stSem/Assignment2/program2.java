
import java.util.Scanner;
public class program2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter distance in Km : ");
		double dist = sc.nextInt();
		double  meter , feet, inch , centimetres ;
		meter = dist * 1000;
		feet = dist * 3280.8399;
		inch = dist * 39370.0787;
		centimetres = 100000 * dist;
		System.out.println(dist + " km is " + meter + "metres" );
		System.out.println(dist + " km is " + feet + "feet");
		System.out.println(dist + " km is " + inch +"inches");
		System.out.println(dist + " km is " + centimetres + "cm");
		
		
		
		// TODO Auto-generated method stub

	}

}
