import java.util.Scanner;
public class program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[4];
		System.out.println("enter four colours");
		for(int i=0;i<4;i++) {
			arr[i]=sc.next();
		}
		try {
			Integer.parseInt(arr[0]);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		try {
			System.out.println("enter one more colour");
			arr[5] = sc.next();
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Colours: ");
		for(int i=0;i<4;i++) {
			System.out.println(arr[i]);
		}
		// TODO Auto-generated method stub

	}

}
