import java.util.Scanner;
public class program9 {
	static boolean password(String s) {
		int cn=0;
		if(s.length()<8)
			return false;
		else {
			for (int i=0;i<s.length();i++)
			{
				if((s.charAt(i)>=48&&s.charAt(i)<=57)||(s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122)) 
				{
					if(s.charAt(i)>=48 && s.charAt(i)<=57)
					{
						cn=cn+1;
					}
				}
			}
			if(cn>=2)
				return true;
			else
				return false;
		}
		
			
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the passwo");
		String pass=sc.next();
		boolean pa= password(pass);
		if (pa==true)
			System.out.println("password is valid");
		else
			System.out.println("invalid");
		// TODO Auto-generated method stub

	}

}
