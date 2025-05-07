import java.util.Scanner;
public class q1 {

	public static void main(String[] args) 
	{
		System.out.println("enter m");
		Scanner sc = new Scanner(System.in);
		int min=sc.nextInt();
		int years=(min/525600);
		int days = (min%525600)/1440;
		System.out.println(min+" mins "+years+" yrs "+ days+" day");
		// TODO Auto-generated method stub

	}

}
