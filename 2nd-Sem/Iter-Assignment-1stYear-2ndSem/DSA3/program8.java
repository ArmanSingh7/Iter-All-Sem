import java.util.Scanner;

public class program8 {

	   static int rev(int n,int reverse){
	        if (n==0){
	            return reverse;}
	        else {
	            int ld = n % 10;//4
	            reverse = reverse * 10 + ld;
	            int rd = n / 10;
	            return rev(rd, reverse);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the no.");
	        int n = sc.nextInt();
	        System.out.println(rev(n,0));

	    }
}