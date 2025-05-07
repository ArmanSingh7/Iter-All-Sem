//import java.util.Scanner;
public class progx {
   public static void main(String []args) 
   {
	   int z=-4;
	   int k=z++ + ++z + ++z;
	   System.out.println(k);
	   //     -4 + -  + -1 =-7
	   int t=-k +k++ + z++;
	   //     7+ -7 -1 = -1 
	   System.out.println(k);
	   int p =t++ -(t%5) + (p=t);
	   //     -1  -0 + 0
	   System.out.println(p);
	   System.out.println(z+" "+k+" "+ t+" "+p);
   }	   
}