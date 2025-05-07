import java.util.Scanner;
public class program3 {

	public static void main(String[] args) {

			// TODO Auto-generated method stub
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter the value of x to calculate sin(x) : ");
			double x = in.nextDouble();
			x = Math.toRadians(x);
			System.out.println(x);
			System.out.println(Math.abs(x));
			
			double error = 0.00001; //10^-5
			double t = x;
			double i = 3;
			double sum = x;
			while(Math.abs(t)>error)
			{
				t = (-1)*t*((x*x)/((i-1)*i));
				sum = sum + t;
				i = i + 2;
			}
			System.out.println("sin(" + x + ") = " + sum);
		}

	}