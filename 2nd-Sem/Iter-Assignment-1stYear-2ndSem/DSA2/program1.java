import java.util.Scanner;
class Phone{
	int area_code,exchange,number;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		area_code=sc.nextInt();
		exchange=sc.nextInt();
		number=sc.nextInt();
		System.out.println(area_code+" "+exchange+" "+number);
		
	}
	void display(int a,int b, int c)
	{
		a=area_code;
		b=exchange;
		c=number;
		System.out.println(a+" "+b+" "+c);
	}
}
public class program1 {

	public static void main(String[] args) {
		Phone ob= new Phone();
		Phone ob1=new Phone();
		ob.input();
		ob1.display(10,2,3);
		
		
		// TODO Auto-generated method stub

	}

}
