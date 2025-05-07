
public class program_8_without_3rd_var {

	public static void main(String[] args) {
		int a = 1, b =2;
		System.out.println("a= " + a+ " " + "b = " + b);
		a = a + b; // 3
		b = a -b; // 1
		a = a-b; // 2
		System.out.println("a= " +  a+ " " + " b = " + b);
		
		int x = 10 , y =20;
		System.out.println("x= " + x+ " " + "y = " + y);
		x= x*y;
		y=x/y;
		x=x/y;
		System.out.println("x= " +  x+ " " + "y = " + y);
		// TODO Auto-generated method stub

	}

}
