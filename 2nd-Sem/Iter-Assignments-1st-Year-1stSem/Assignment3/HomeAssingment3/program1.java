import java.util.Scanner;
public class program1 
{

	public static void main(String[] args) 
	{
		System.out.println("Scissor(0), rock(1), paper(2): ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int m = (int)(Math.random()*3);
		String s = " Scissor";
		String a = " Rock";
		String b = "Paper";
		String p = "";
		String t = "";
		switch(x)
		{
		case 0:
			p= s;
			break;
		case 1:
			p=a;
			break;
		case 2:
			p=b;
			break;
		default:
			System.out.println("Invalid");
			
		}
		switch(m)
		{
		case 0:
			t= s;
			break;
		case 1:
			t=a;
			break;
		case 2:
			t=b;
			break;
		default:
			System.out.println("Invalid");
			
		}
		if (x==m)
		{
			System.out.println("The computer is "+t+". You are "+p+".It is draw");
		}
		else if (((x==0) && (m==2)) ||((x==1) && (m==0)) || ((x==2)&&(m==1)))
        {
        	System.out.println("The computer is "+t+". You are "+p+". You won");
	
        }
		else
		{
			System.out.println("The computer is "+t+". You are "+p+". You lose");
		}

     }
}
