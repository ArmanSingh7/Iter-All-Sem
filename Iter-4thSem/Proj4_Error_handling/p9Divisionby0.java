package Proj4_Error_handling;
import java.util.*;
public class p9Divisionby0 {
  public static void main(String []args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number a and b to divide ");
	  int a =sc.nextInt();
	  int b = sc.nextInt();
	  try {
		  int c = a/b;
		  System.out.println(c);
		  
		  
	  }
	  catch (ArithmeticException e){
		  System.out.println(e);
	  }
  }
}
