import java.util.Scanner;
public class program10 {

	public static void main(String[] args) 
	{
		System.out.println(" Enter the marks : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		x = x/10;
		switch(x) 
		{
		case 10:
			System.out.println(" O ");
			break;
		case 9:
			System.out.println(" O ");
			break;
		case 8:
			System.out.println("A");
			break;
		case 7:
			System.out.println("B");
			break;
		case 6:
			System.out.println("C");
			break;
		case 5:
			System.out.println("D");
			break;
		case 4:
			System.out.println("E");
			break;
		default:
			System.out.println("Fail");
        }
		
    }
}
