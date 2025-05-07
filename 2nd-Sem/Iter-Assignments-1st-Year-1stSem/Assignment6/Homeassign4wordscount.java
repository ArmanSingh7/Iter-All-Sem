import java.util.Scanner;
public class Homeassign4wordscount {
	static int word(String str) {
		int count=1;
		for (int i=0;i<str.length();i++)
		{
			if((str.charAt(i)==' ')&& (str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("the no. of words=" + word(s));
		
		// TODO Auto-generated method stub

	}

}
