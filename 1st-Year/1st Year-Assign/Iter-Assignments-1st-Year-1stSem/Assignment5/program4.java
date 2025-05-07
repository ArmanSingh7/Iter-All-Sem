import java.util.Scanner;
public class program4 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = in.nextInt();
        System.out.print("Enter n: ");
        int n = in.nextInt();

        if (m < n && m > 0 && n > 0) {
            for (int i = m; i <= n; i++) {
                 int fact = 1;
                for (int j = 1; j <= i; j++)//
                    fact *= j;
                System.out.println("Factorial of " + i + " = " + fact);
            }
        }
        else {
            System.out.println("Invalid Input");
        }

    }
}