import java.util.Scanner;
class MarksOutOfBoundException extends Exception{
	MarksOutOfBoundException(String s){
		super(s);
	}
}
public class program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter mark");
		try {
			
			double mark = sc.nextDouble();
			if(mark>100)
				throw new MarksOutOfBoundException("marks cannot be>100");
			
			System.out.println(name+" got "+ mark);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
