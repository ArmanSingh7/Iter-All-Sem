import java.util.Scanner;
public class program7 {
	
	static int fact(int n) {
		if(n==0)
			return 1;
		int f = fact(n-1)*n;
		return f;
	}
	
	static int power(int x , int y) {
		if(y==0)
			return 1;
		if(y==1)
			return x;
		else {
			int p=power(x,y-1)*x;
			return p;
		}
	}
	static int gcd(int x , int y) {
		if(y==0)
			return x;
		else
			return gcd(y,x%y);
	}
	static String binary(int a) {
		if(a==0)
			return "0";
		else if(a==1)
			return "1";
		else {
			int rem = a%2;
			int quot = a/2;
			return binary(quot)+rem;
		}
	}
	static int prod(int a, int b) {
		if(b==0)
			return 0;
		else if(b>0)
			return a+prod(a,b-1);
		else {
			return -prod(a,-b);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter for mathematical operation"
				+ "1.fact 2.x^n 3.gcd 4.binary 5.product of 2 no.s");
		int n = sc.nextInt();
		switch(n){
			case 1:
				int p=sc.nextInt();
				System.out.println(fact(p));
				break;
		
			case 2:
				int x=sc.nextInt();
				int y = sc.nextInt();
				System.out.println(power(x,y));
				break;
			case 3:
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(gcd(a,b));
				break;
			case 4:
				int x1=sc.nextInt();
				System.out.println(binary(x1));
				break;
			case 5:
				int a1=sc.nextInt();
				int b1 = sc.nextInt();
				System.out.println(prod(a1,b1));
				break;
			default:
				System.out.println("invalid no.");
		}
	}

}
