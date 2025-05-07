import java.util.Scanner;
public class program7 
{
	static int count(String str) 
	{
		String s=str;
		char a = 'a' ;
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';
		int n=0;
		str = str.toLowerCase();
		for (int i1 = 0;i1<s.length();i1++)
		{
			if(s.charAt(i1)==a || s.charAt(i1)==e || s.charAt(i1)==i || s.charAt(i1)==o || s.charAt(i1)==u) {
				n=n+1;
			}
	
	
            else {
//            	//n++;
//            	n=n+1;
            }
		
		}
		return n;
	}
		

	public static void main(String[] args) 
	{
		System.out.println("enter a String ");
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		int num = count(s);
		System.out.println("the number of vowels are "+num);
		
		// TODO Auto-generated method stub

	}

}