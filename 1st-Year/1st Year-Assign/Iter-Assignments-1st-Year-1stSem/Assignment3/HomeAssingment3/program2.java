import java.util.Scanner;
public class program2 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter an integer for today's day");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter the number of day elapsed since today: ");
		Scanner po = new Scanner(System.in);
		int fd= po.nextInt();
		
		String days="";
		int s;
		s= x;
		
		
		switch(s) {
		case 0:
			days="Sunday";
			break;
		case 1:
			days="Monday";
			break;
		case 2:
			days ="Tuesday";
			break;
		case 3:
			days ="Wednesday";
			break;
		case 4:
			days ="Thursday";
			break;
		case 5:
			days= "Friday";
			break;
		case 6: 
			days="Saturday";
		default:
			System.out.println("Invalid");
		}
		String day="";
		int ss=(fd%7)+x;
		switch(ss) {
		case 0:
			day="Sunday";
			break;
		case 1:
			day="Monday";
			break;
		case 2:
			day ="Tuesday";
			break;
		case 3:
			day ="Wednesday";
			break;
		case 4:
			day ="Thursday";
			break;
		case 5:
			day= "Friday";
			break;
		case 6: 
			day="Saturday";
		default:
			System.out.println("Invalid");
		}
		System.out.println("Today is "+days+ " and the future day is "+day);
		
		// TODO Auto-generated method stub

	}

}
