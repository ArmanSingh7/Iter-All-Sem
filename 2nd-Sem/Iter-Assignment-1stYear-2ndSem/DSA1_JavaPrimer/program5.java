import java.util.Scanner;
public class program5 {
	public static int sum_of_digits(int n) {
		//int num=n;
		int sum=0;
		while(n>0 || sum>9) {
			if (n==0) {
				n=sum;
				sum=0;
			}
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sum_of_digits(n);
		System.out.println(a);
		// TODO Auto-generated method stub

	}

}
