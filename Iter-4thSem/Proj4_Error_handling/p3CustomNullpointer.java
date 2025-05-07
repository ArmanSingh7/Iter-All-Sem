package Proj4_Error_handling;


class CustomNullpointer extends Exception{
	public CustomNullpointer(String message) {
		super(message);
	}
}
public class p3CustomNullpointer {
	public static void main(String []args) {
		String s=null;
		try {
			if(s==null)
				throw new CustomNullpointer("Null custom");
			}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
