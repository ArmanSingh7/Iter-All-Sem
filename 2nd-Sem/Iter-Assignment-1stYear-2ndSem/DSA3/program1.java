import java.util.Scanner;
public class program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your lucky number");
		try {
		int i = sc.nextInt();
		if (i<0)
			throw new NumberFormatException("negative no.");
			System.out.println("Your lucky no. is "+ i);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
