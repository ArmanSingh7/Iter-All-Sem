import java.util.Scanner;
public class program6 {
	public static boolean isodd(int n) {
		boolean isEven = true;
        
        for (int i = 0; i <= n; i++)
            isEven = !isEven;
             
        return isEven;
	}
	    

	public static void main(String[] args) {
		System.out.println("enter a no.");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isodd(n));

		
		// TODO Auto-generated method stub

	}

}
