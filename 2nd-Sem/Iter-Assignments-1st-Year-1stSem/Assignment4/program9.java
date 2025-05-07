import java.util.Scanner;
public class program9 {

	public static void main(String[] args) 
	{
		System.out.println("enter the no. ");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0,newNum=0;
	    int n = num;
	        
	        while (n != 0) // 2040
	        {
	            int dig = n % 10; //0
	            if (dig != 0) // 
	            {
	                newNum += (int)(dig * Math.pow(10, i));
	                i++;
	            }
	            n /= 10;
	        }
	        System.out.println("After removing 0 from number "+num+" the new number is "+newNum);
	}

}
//j=1
//newnum=newnum+d*j
//j*=10;
