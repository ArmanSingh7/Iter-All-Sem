import java.util.Scanner;
public class program8 {

	public static void main(String[] args) 
	{
		System.out.println("Enter x and y");
		Scanner sc  = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		if((x>0)&&(y>0))
		{
			System.out.println("("+x+","+y+")"+ "is in quadrant - I");
		}
		else if((x<0)&&(y>0))
		{
			System.out.println("("+x+","+y+")"+ "is in quadrant - II");
		}
		else if((x<0)&&(y<0))
		{
			System.out.println("("+x+","+y+")"+ "is in quadrant - III");
		}
		else if((x>0)&&(y<0))
		{
			System.out.println("("+x+","+y+")"+ "is in quadrant - IV");
		}
		else
		{
			if ((x==0)&&(y==0))
			{
				System.out.println("("+x+","+ y+") is on origin");
			}
			else if((x==0)&&(y!=0))
			{
				System.out.println("("+x+","+ y+") is on y axis");
			}
			else
			{
				System.out.println("("+x+","+ y+") is on x axis");
			}
		}
		// TODO Auto-generated method stub

	}

}

