import java.util.Scanner;
public class pro9 {

	public static void main(String[] args) 
	{
		System.out.println("enter no. betn 0-1000 ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();//749
		int ld=0,md=0, fd=0,sum=0;
//		while(n!=0)//749
//		{
//			ld=n%10;//9 4 7
//			n=n/10;//74 7 0
//			sum=sum+ld;//9 13 20
//		}
//		System.out.println(sum);
//		
		ld=n%10;//9
//		sum=sum+ld;
		n = n/10; //74
		md = n%10; //4
//		sum= sum+ld; //13
		n = n/10; // 7
		fd = n%10; //7
 		sum =fd+ld; //20
 		System.out.println(sum);
	
		
	}

}
